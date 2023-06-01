package tests;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.FindBookPage;

@DisplayName("Проверка первого результата")
public class LitresSearchTestWithCsvSource extends TestBase {

    FindBookPage steps = new FindBookPage();

    @BeforeEach
    void setup() {
        steps.openMainPage();
    }

    @CsvFileSource(resources = "/data/firstSearchResult.csv")
    @ParameterizedTest(name = "В поисковой выдаче на Litres по запросу {0} первым отображается результат {1}")
    @Tag("ui")
    void firstBookNameInSearchResults(String testData, String expectedText) {
        steps.enterBookName(testData);
        steps.checkFirstBookName(expectedText);
    }
}