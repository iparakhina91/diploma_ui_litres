package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import tests.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FindBookPage {

    private SelenideElement
            searchInput = $("input[name=q]"),
            searchResultsByBookName = $("#art_item_28295241"),
            firstSearchResult = $$(".result__name").first().$("a"),
            boxWithAuthorBook = $(".author-page__books"),
            searchResultsByPublisher = $(".tab-active"),
            sectionNewReleases = $("#newbooks"),
            sectionField = $$(".art__name").first().$("a"),
            noResultsHeading = $(".ab-container.b_interested__book"),
            searchButton = $("#go[type=submit]"),
            errorSearchHeader = $(".header_search_error"),
            firstBookName = $$(".art-item__name").first().$("a");

    @Step("Открыть главную страницу")
    public void openMainPage() {
        open("https://litres.com/");
    }

    @Step("Ввести часть названия книги в поле поиска")
    public void enterBookName(String value) {
        searchInput.setValue(value).pressEnter();
    }

    @Step("Проверить наличие книги с данным названием в результатах поиска")
    public void checkSearchResultsByBookName(String value) {
        searchResultsByBookName.shouldHave(text(value));
    }

    @Step("Ввести автора в поле поиска")
    public void enterBookAuthor(String value) {
        searchInput.setValue(value).pressEnter();
    }

    @Step("Проверить, что в результатах поиска есть книги данного автора")
    public void checkSearchResultsByAuthorName(String value) {
        firstSearchResult.click();
        boxWithAuthorBook.shouldHave(text(value));
    }

    @Step("Ввести название издательства в поле поиска")
    public void enterPublisher(String value) {
        searchInput.setValue(value).pressEnter();
    }

    @Step("Проверить, что в результатах поиска есть книги данного издательства")
    public void checkSearchResultsByPublisher(String value) {
        firstSearchResult.click();
        searchResultsByPublisher.shouldHave(text(value));
    }

    @Step("Перейти в раздел New releases")
    public void openNewReleases() {
        sectionNewReleases.click();
    }

    @Step("Проверить наличие книги в результатах поиска")
    public void findBookInSection(String value) {
        sectionField.shouldHave(text(value));
    }

    @Step("Проверить, что в результатах поиска нет книги с таким названием")
    public void checkNoResultsError(String value) {
        noResultsHeading.shouldHave(text(value));
    }

    @Step("Кликнуть по кнопке поиска")
    public void clickSearchButton() {
        searchButton.click();
    }

    @Step("Проверить, что отображается ошибка с корректным текстом")
    public void checkErrorHeader(String value) {
        errorSearchHeader.shouldHave(text(value));
    }

    @Step("Проверить, что книга отображается первой в результатах поиска")
    public void checkFirstBookName(String value) {
        firstBookName.shouldHave(text(value));
    }
}
