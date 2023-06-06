package tests;

import static utils.FakeUtils.getFakeBookName;

public class TestData {

    public static String
            fakeBookName = getFakeBookName(),
            searchBookName = "harry potter",
            resultBookName = "The Ultimate Harry Potter and Philosophy. Hogwarts for Muggles",
            searchAuthor = "Fredrik Backman",
            headerSearchByAuthor = "All books by this author",
            searchPublisherName = "Eksmo Digital",
            headerSearchByPublisher = "Books ",
            bookNameInSection = "The Haunted Hotel: A Mystery of Modern Venice",
            errorText = "The search query is too short";
}
