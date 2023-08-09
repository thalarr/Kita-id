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

Mobile.startExistingApplication('com.kita.id')

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Get Width Height and Store in device_Width variable'
device_Height = Mobile.getDeviceHeight()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/MenuPinjaman'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/Aktivasi Paylater'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/Provinsi'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/SearchProvinsi'), 0)

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/SearchProvinsi'), 'DKI Jakarta', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/android.widget.TextView - DKI Jakarta'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/SearchKota'), 0)

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/SearchKota'), 'Jakarta Selatan', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/android.widget.TextView - Jakarta Selatan, Wil. Kota'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/SearchKecamatan'), 0)

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/SearchKecamatan'), 'Tebet', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/android.widget.TextView - Tebet'), 0)

Mobile.tap(findTestObject('Paylater (kita)/SearchKelurahan'), 0)

Mobile.setText(findTestObject('Paylater (kita)/SearchKelurahan'), 'Manggarai', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Paylater (kita)/android.widget.TextView - Manggarai'), 0)

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/KodePekerjaan'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/SearchNamaPekerjaan'), 0)

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/SearchNamaPekerjaan'), 'Dokter', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/android.widget.TextView - Dokter'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/NamaTempatKerja'), 0)

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/NamaTempatKerja'), 'RS Hermina', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/KodeBidangUsaha'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/SearchNamaBidangUsaha'), 0)

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/SearchNamaBidangUsaha'), 'Rumah sakit', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/android.widget.TextView - Jasa Kesehatan Manusia-Rumah sakit'), 
    0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/PenghasilanKotor'), 0)

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/PenghasilanKotor'), '200000000', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/SumberPenghasilanDropdown'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/android.widget.CheckedTextView - Gaji'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/android.widget.TextView - Lanjut'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/StatusPerkawinanDropdown'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/android.widget.CheckedTextView - Menikah'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/JumlahTanggungan'), 0)

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/JumlahTanggungan'), '4', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/NoIdentitasPasangan'), 0)

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/NoIdentitasPasangan'), '320202134394', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/NamaPasangan'), 0)

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/NamaPasangan'), 'widia', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Paylater (kita)/Aktivasi paylater/TanggalLahirPasangan'), '12/12/2000', 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/PerjanjianHarta'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/android.widget.CheckedTextView - Ya'), 0)

Mobile.tap(findTestObject('Paylater (kita)/Aktivasi paylater/android.widget.TextView - Lanjut'), 0)

Mobile.tap(findTestObject('Paylater/android.widget.Button - YA'), 0)

