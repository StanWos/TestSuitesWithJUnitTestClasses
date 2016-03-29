package com.main;

import com.main.categories.Buggy;
import com.main.features.TodosOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class)
@Suite.SuiteClasses(TodosOperationsAtAllFilterTest.class)
@Categories.IncludeCategory(Buggy.class)
public class BuggySuiteTest {
}
