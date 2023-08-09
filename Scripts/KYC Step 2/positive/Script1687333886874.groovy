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

Mobile.tap(findTestObject('KYC2 (kita)/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('KYC2 (kita)/Provinsi'), 0)

Mobile.tap(findTestObject('KYC2 (kita)/SearchProvinsi'), 0)

Mobile.setText(findTestObject('KYC2 (kita)/SearchProvinsi'), GlobalVariable.G_Provinsi, 0)

Mobile.tap(findTestObject('KYC2 (kita)/android.widget.TextView - DKI Jakarta'), 0)

Mobile.tap(findTestObject('KYC2 (kita)/SearchKota'), 0)

Mobile.setText(findTestObject('KYC2 (kita)/SearchKota'), GlobalVariable.G_Kota, 0)

Mobile.tap(findTestObject('KYC2 (kita)/android.widget.TextView - Jakarta Selatan, Wil. Kota'), 0)

Mobile.tap(findTestObject('KYC2 (kita)/SearchKecamatan'), 0)

Mobile.setText(findTestObject('KYC2 (kita)/SearchKecamatan'), GlobalVariable.G_Kecamatan, 0)

Mobile.tap(findTestObject('KYC2 (kita)/android.widget.TextView - Tebet'), 0)

Mobile.tap(findTestObject('KYC2 (kita)/SearchKelurahan'), 0)

Mobile.setText(findTestObject('KYC2 (kita)/SearchKelurahan'), GlobalVariable.G_Kelurahan, 0)

Mobile.tap(findTestObject('KYC2 (kita)/android.widget.TextView - Tebet Barat'), 0)

Mobile.tap(findTestObject('KYC2 (kita)/android.widget.TextView - LANJUT'), 0)

