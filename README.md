# Дипломный проект по автоматизации тестирования UI на сайте [litres.com](https://litres.com)

<p align="center">
  <img src="media/logo/logo.png" width="1000">
</p>
 
## :bricks: Содержание 

* <a href="#annotation">Описание проекта</a>
* <a href="#tools">Технологии и инструменты</a>
* <a href="#cases">Реализованные проверки</a>
* <a href="#console">Запуск тестов из терминала</a>
* <a href="#jenkins">Запуск тестов в Jenkins</a>
* <a href="#allure">Отчет о результатах тестирования в Allure Report</a>
* <a href="#video">Пример прогона теста в Selenoid</a>
* <a href="#allure-testops">Интеграция с Allure TestOps</a>
* <a href="#jira">Интеграция с Jira</a>
* <a href="#telegram">Уведомления в Telegram</a>

<a id="annotation"></a>
## :memo: Описание проекта
ИЗМЕНИТЬ
Проект состоит из API тестов, в результате которых анализируется интерфейс прикладной программы (API) сайта [reqres.in](https://reqres.in/). Тесты выполняются путем отправки запросов к конечным точкам API и сравнения ответа с ожидаемыми результатами.

<code>Цель тестирования</code> - убедиться, что интерфейс прикладной программы соответствует ожидаемой функциональности, безопасности, производительности и надежности. 

<code>Интересные факты о проекте:</code>
- тестовая документация оформлена с использованием аннотаций `Allure`
- тестовые данные сгенерированы с помощью библиотеки `Faker`
- применяется конфигурация с использованием техноголии `Owner` для запуска тестов в зависимости от параметров сборки
- для создания подробных отчетов реализована интеграция с `Allure TestOps`
- в целях получения информации о статусах тикетов, прилинкованных к тест-кейсам, реализована интеграция  с `Jira`
- настроена отправка уведомлений в `Telegram` о результатах прохождения автотестов   

<a id="tools"></a>
## :hammer_and_wrench: Технологии и инструменты

<p align="left">
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logo/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://web.telegram.org/"><img src="media\logo\Telegram.svg" width="50" height="50" alt="Telegram" title="Telegram"></a>
<a href="https://qameta.io/"><img src="media\logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO" title="Allure_TO"></a>
<a href="https://www.jira.com/"><img src="media\logo\Jira.svg" width="50" height="50" alt="Jira" title="Jira"></a>
</p>

Автотесты в данном проекте написаны на Java с использованием фреймворка [Selenide](https://selenide.org/).\
<code>Gradle</code> — используется как инструмент автоматизации сборки.\
<code>JUnit5</code> — для выполнения тестов.\
<code>Selenoid</code> — для удаленного запуска браузера в Docker контейнерах.\
<code>REST Assured</code> — для тестирования REST-API сервисов.\
<code>Jenkins</code> — CI/CD для запуска тестов удаленно.\
<code>Allure Report</code> — для визуализации результатов тестирования.\
<code>Allure TestOps</code> — как система управления тестированием.\
<code>Jira</code> — как инструмент управления проектом и таск-трекер.\
<code>Telegram Bot</code> — для уведомлений о результатах тестирования.

<a id="cases"></a>
## :clipboard: Реализованные проверки

-  <code>Поиск книги</code>
    -  Поиск книги по названию
    -  Поиск книги по автору
    -  Поиск книги по названию издательства
    -  Поиск книги с несуществующим названием
    -  Проверка логики работы сервиса при пустом поиске  
-  <code>Проверка первых результатов выдачи</code>

<a id="console"></a>
## :computer: Запуск тестов из терминала
### Локальный запуск тестов

```
gradle clean test -Denv=local
```
### Удаленный запуск тестов
```
gradle clean test -Denv=remote
```

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/18-ikorovina91-diploma-ui-litres/)
Для запуска тестов необходимо нажать кнопку <code>Собрать с параметрами</code>, установить параметры сборки и кликнуть по кнопке <code>Собрать</code>

<p align="center">
  <img src="media/screenshots/sborka_jenkins.png" alt="Jenkins" width="1000">
</p>

После завершения прогона для просмотра будут доступны артефакты запуска и полезные ссылки в целях более детального изучения результатов прохождения тестов.

<p align="center">
  <img src="media/screenshots/jenkins_results.png" alt="Jenkins" width="1000">
</p>

<a id="allure"></a>
## <img src="media/logo/Allure_Report.svg" width="25" height="25"/></a> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/18-ikorovina91-diploma-ui-litres/4/allure/)

Одним из результатов сборки является <code>Allure Report</code>, в котором помимо просмотра итогового отчета на странице теста можно ознакомиться с пошаговым выполнением кода

<p align="center">
  <img src="media/screenshots/allure_overview.png" alt="allure" width="1000">
</p>

<p align="center">
  <img src="media/screenshots/allure.png" alt="allure" width="1000">
</p>

<a id="video"></a> 
## :film_strip: Пример прогона теста в Selenoid

К каждому тесту в отчете прилагается видео

<p align="center">
  <img src="media/screenshots/video.gif" width="1000">
</p>

<a id="allure-testops"></a> 
## <img src="media/logo/Allure_TO.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/2536/dashboards)

Реализованная в проекте интеграция с <code>Allure TestOps</code> позволяет не только ознакомиться с отчетом о результатах прохождения тестов, но и запускать автотесты и наблюдать за результатом их выполнения в режиме реального времени. При этом, возможности Allure TestOps позволяют выбирать, какие именно тесты запускать. 

<p align="center">
  <img src="media/screenshots/allure_dashboard.png" alt="allure-testops" width="1000">
</p>

<p align="center">
  <img src="media/screenshots/allureOPS_launches.png" alt="allure-testops" width="1000">
</p>

<p align="center">
  <img src="media/screenshots/run_tests_allure.png" alt="allure-testops" width="1000">
</p>

<a id="jira"></a> 
## <img src="media/logo/Jira.svg" width="25" height="25"/></a> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-727)

<p align="center">
  <img src="media/screenshots/jira.png" alt="jira" width="1000">
</p>

<a id="telegram"></a> 
## <img src="media/logo/Telegram.svg" width="25" height="25"/></a> Уведомления в Telegram

После завершения прогона в Jenkins с помощью бота осуществляется отправка уведомления в <code>Telegram</code> о результатах прохождения тестов

<p align="left">
  <img src="media/screenshots/telegram.png" alt="telegram" width="500">
</p>


