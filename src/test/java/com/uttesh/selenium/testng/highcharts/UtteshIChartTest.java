/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uttesh.selenium.testng.highcharts;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

/**
 *
 * @author Rivet Systems
 */
public class UtteshIChartTest {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass
    public void setUp() {
        File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        driver = new FirefoxDriver(ffBinary,firefoxProfile);
        //driver = new FirefoxDriver();
        baseUrl = "http://www.highcharts.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

    @Test
    public void icharTest() throws InterruptedException {
        try{
        driver.get(baseUrl + "/demo/line-basic");
        driver.findElement(By.linkText("Basic line")).click();
        Thread.sleep(500);
        WebElement element = driver.findElement(By.id("highcharts-0"));
        Thread.sleep(1000);
            System.out.println("element text "+element.getText());
             System.out.println("element getTagName "+element.getTagName());
        LineChart base = new LineChart(driver, element);
        System.out.println("is char displayed "+base.isChartDisplayed());
        System.out.println("is char isLegendDisplayed "+base.isLegendDisplayed());
        System.out.println("is char isLegendDisplayed "+base.getLegendText());
        System.out.println("is char isTooltipDisplayed "+base.isTooltipDisplayed());
        //System.out.println("char getToolTipLine 1 "+base.getToolTipLine(4));
        System.out.println("getXAxisLabelsAsArray() length"+base.getXAxisLabelsAsArray().length);
        for(String label:base.getXAxisLabelsAsArray()){
            System.out.println("label : "+label);
        }
        //base.hoverOverPointOfGraphAtXAxisLabel("May");
//        System.out.println("base.getToolTipLine(1);"+base.getToolTipLine(1));
//        System.out.println("base.getToolTipLine(1);"+base.getSeriesColorAtXAxisPosition(1, "May"));
//        WebElement element1 = base.getXAxisLabels();
//        System.out.println("base.getText"+element1.getText());
//        List<String> xlabels = base.getXAxisLabelsText();
//        for(String label:xlabels){
//            System.out.println("labels"+label);
//        }
        }catch(Exception e){
            e.printStackTrace();
        }
                
        
    }
    
 
}
