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

Mobile.tap(findTestObject('Ubah pin dan password baru (kita)/PasswordBaru'), 0)

Mobile.setText(findTestObject('Ubah pin dan password baru (kita)/PasswordBaru'), GlobalVariable.G_Password, 0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Ubah pin dan password baru (kita)/KonfirmasiPassword'), 0)

Mobile.setText(findTestObject('Ubah pin dan password baru (kita)/KonfirmasiPassword'), GlobalVariable.G_Password_Confirmation, 
    0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Ubah pin dan password baru (kita)/PinBaru'), 0)

Mobile.setText(findTestObject('Ubah pin dan password baru (kita)/PinBaru'), GlobalVariable.G_Pin, 0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Ubah pin dan password baru (kita)/KonfirmasiPin'), 0)

Mobile.setText(findTestObject('Ubah pin dan password baru (kita)/KonfirmasiPin'), GlobalVariable.G_Pin_Confirmation, 0)

'Hide keyboard'
Mobile.hideKeyboard()

Mobile.tapAndHold(findTestObject('Ubah pin dan password baru (kita)/android.widget.TextView - SIMPAN DAN LANJUTKAN'), 5, 
    20)

