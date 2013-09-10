package org.selenide;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Pending;
import org.junit.Test;
import org.selenide.pages.DictionaryPage;

import static com.codeborne.selenide.Selenide.open;
import com.test.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.runner.RunWith;

//@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
public class SearchByKeywordStoryTest {
    
    @Steps
    public EndUserSteps endUser;
    
    DictionaryPage dictionaryPage = open("http://en.wiktionary.org/wiki/Wiktionary:Main_Page", DictionaryPage.class);

    @Issue("#WIKI-1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        endUser.setPage(dictionaryPage);
        endUser.starts_search_apple();
        
    }

    @Test
    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
        endUser.setPage(dictionaryPage);
        endUser.starts_search_pear();
    }

    @Pending @Test
    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
    }
} 