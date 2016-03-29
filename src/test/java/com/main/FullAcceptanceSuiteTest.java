package com.main;

import categories.All;
import categories.Buggy;
import features.TodosE2ETest;
import features.TodosOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Suite.SuiteClasses({TodosE2ETest.class, TodosOperationsAtAllFilterTest.class})
@Categories.IncludeCategory(All.class)
@Categories.ExcludeCategory(Buggy.class)
public class FullAcceptanceSuiteTest {
}
