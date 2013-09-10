package com.test.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.selenide.pages.DictionaryPage;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;

    public EndUserSteps(Pages pages) {
        super(pages);
    }

    @Step
    public void starts_search_apple() {
        dictionaryPage.searchFor("apple");
        dictionaryPage.shouldSeeDefinition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");
    }

    @Step
    public void starts_search_pear() {
        dictionaryPage.searchFor("pear");
        dictionaryPage.shouldSeeDefinition("wrong text");    
    }
    
    public void setPage(Object page) {
        dictionaryPage = (DictionaryPage) page;
    }

}