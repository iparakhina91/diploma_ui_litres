package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.FindBookPage;

import static tests.TestData.*;

@Tag("ui")
@Feature("Поиск книги")
@Story("Поиск книги в зависимости от данных запроса")
@Owner("korovina_iyu")
@Severity(SeverityLevel.NORMAL)
public class FindBookTests extends TestBase {

    FindBookPage steps = new FindBookPage();

    @Test
    @DisplayName("Поиск книги по названию")
    void findBookByName() {
        steps.openMainPage();
        steps.enterBookName(searchBookName);
        steps.checkSearchResultsByBookName(resultBookName);
    }

    @Test
    @DisplayName("Поиск книги по автору")
    void findBookByAuthor() {
        steps.openMainPage();
        steps.enterBookAuthor(searchAuthor);
        steps.checkSearchResultsByAuthorName(headerSearchByAuthor);
    }

    @Test
    @DisplayName("Поиск книги по издательству")
    void findBookByPublisher() {
        steps.openMainPage();
        steps.enterPublisher(searchPublisherName);
        steps.checkSearchResultsByPublisher(headerSearchByPublisher);
    }

    @Test
    @DisplayName("Поиск книги в разделе")
    void findBookInNewReleases() {
        steps.openMainPage();
        steps.openNewReleases();
        steps.findBookInSection(bookNameInSection);
    }

    @Test
    @DisplayName("Поиск книги с несуществующим названием")
    void findBookWithNonExistName() {
        steps.openMainPage();
        steps.enterBookName(fakeBookName);
        steps.checkNoResultsError("By request «" + fakeBookName + "» Nothing found");
    }
}