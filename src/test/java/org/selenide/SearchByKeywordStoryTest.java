package org.selenide;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Pending;
import org.junit.Test;
import org.selenide.pages.DictionaryPage;

import static com.codeborne.selenide.Selenide.open;

public class SearchByKeywordStoryTest {
    DictionaryPage dictionaryPage = open("http://en.wiktionary.org/wiki/Wiktionary:Main_Page", DictionaryPage.class);

    @Issue("#WIKI-1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        dictionaryPage.searchFor("apple");
        dictionaryPage.shouldSeeDefinition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");
    }

    @Test
    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
        dictionaryPage.searchFor("pear");
		dictionaryPage.shouldSeeDefinition("An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.");
    }

    @Pending @Test
    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
    }
} 