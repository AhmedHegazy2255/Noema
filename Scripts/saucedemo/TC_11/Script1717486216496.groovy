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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name (3)'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password (3)'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button (3)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart (2)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1_2_3_4 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1_2_3_4_5 (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/a_6 (1)'), '6')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Remove'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Remove_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Remove_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/a_3'), '3')

WebUI.takeScreenshotAsCheckpoint('Conf10')

WebUI.closeBrowser()

