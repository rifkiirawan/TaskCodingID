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

WebUI.callTestCase(findTestCase('Reuse TC/Access to Register Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Website/form_Nama'), GlobalVariable.Nama)

WebUI.setText(findTestObject('Website/form_Tanggal lahir'), GlobalVariable.TanggalLahir)

WebUI.setText(findTestObject('Website/form_E-Mail'), GlobalVariable.email)

WebUI.setText(findTestObject('Website/form_Whatsapp'), GlobalVariable.Whatsapp)

WebUI.setEncryptedText(findTestObject('Website/form_Kata Sandi'), GlobalVariable.KataSandi)

WebUI.setEncryptedText(findTestObject('Website/form_Konfirmasi kata sandi'), GlobalVariable.NegKataSandi)

WebUI.click(findTestObject('Website/check_Checkbox Setuju Syarat dan Ketentuan'))

WebUI.click(findTestObject('Website/btn_Daftar'))

WebUI.verifyElementText(findTestObject('Website/txt_kata sandi tidak sama'), 'kata sandi tidak sama')

WebUI.closeBrowser()

