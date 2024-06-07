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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.google.com/')

WebUI.click(findTestObject('Object Repository/Page_Google/a__gb_d'))

WebUI.click(findTestObject('Object Repository/Page_Google/span_'))

WebUI.takeElementScreenshotAsCheckpoint('Verfiy English button exists', findTestObject('Page_Google Translate/span_English_VfPpkd-YVzG2b'))

WebUI.click(findTestObject('Object Repository/Page_Google Translate/span_English_VfPpkd-YVzG2b'))

WebUI.click(findTestObject('Object Repository/Page_Google Translate/span_Arabic_VfPpkd-YVzG2b'))

WebUI.setText(findTestObject('Object Repository/Page_Google Translate/textarea_Source text_er8xn'), 'Hel')

WebUI.click(findTestObject('Object Repository/Page_Google Translate/c-wiz_Source textHelHelclearClear source te_595da7'))

WebUI.setText(findTestObject('Object Repository/Page_Google Translate/textarea_Source text_er8xn_1'), 'Hello ')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Google Translate/span_'), 0)

WebUI.rightClick(findTestObject('Object Repository/Page_Google Translate/span_'))

WebUI.closeBrowser()

