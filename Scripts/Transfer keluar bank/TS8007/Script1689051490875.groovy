import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Login admin panel'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Web/Transaction/Persetujuan transfer/Page_Cardlez - Admin Panel/span_Accounting'))

WebUI.click(findTestObject('Object Repository/Web/Transaction/Persetujuan transfer/Page_Cardlez - Admin Panel/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Web/Transaction/Persetujuan transfer/Page_Cardlez - Admin Panel/span_Persetujuan Transfer'))

WebUI.setText(findTestObject('Object Repository/Web/Transaction/Persetujuan transfer/Page_Cardlez - Admin Panel/input_Actions_form-control ng-untouched ng-_a2d6c4'), 
    '3312306008')

WebUI.sendKeys(findTestObject('Object Repository/Web/Transaction/Persetujuan transfer/Page_Cardlez - Admin Panel/input_Actions_form-control ng-untouched ng-_a2d6c4'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Web/Transaction/Persetujuan transfer/Page_Cardlez - Admin Panel/i_Actions_nb-edit'))

WebUI.click(findTestObject('Web/Transaction/Persetujuan transfer/Page_Cardlez - Admin Panel/button_Setuju'))

WebUI.click(findTestObject('Object Repository/Web/Transaction/Persetujuan transfer/Page_Cardlez - Admin Panel/button_Ya'))

WebUI.click(findTestObject('Object Repository/Web/Transaction/Persetujuan transfer/Page_Cardlez - Admin Panel/button_OK'))

