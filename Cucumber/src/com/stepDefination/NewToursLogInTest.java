package com.stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="newTours",glue="com.NewToursApplicationTesting")

public class NewToursLogInTest {

}
