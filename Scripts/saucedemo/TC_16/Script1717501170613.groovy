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

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name (10)'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password (10)'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button (10)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_29.99'), '$29.99')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart (5)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_9.99'), '$9.99')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1 (3)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_2 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName (1)'), 'Ahmed')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName (1)'), 'Hegazy')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode (1)'), '32861')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_29.99'), '$29.99')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_9.99'), '$9.99')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_Item total 39.98'), 'Item total: $39.98')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/h2_Thank you for your order (1)'), 'Thank you for your order!')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Back Home (1)'))

WebUI.takeScreenshotAsCheckpoint('Conf15')

WebUI.closeBrowser()

