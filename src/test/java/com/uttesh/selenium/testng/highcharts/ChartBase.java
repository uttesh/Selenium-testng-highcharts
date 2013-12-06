/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.uttesh.selenium.testng.highcharts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Rivet Systems
 */
public class ChartBase extends HighCharts{

    public ChartBase(WebDriver driver, WebElement chart) {
        super(driver, chart);
    }
    
}
