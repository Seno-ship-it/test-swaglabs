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

/*
'Open browser with link sauce demo'
WebUI.openBrowser("https://www.saucedemo.com/v1/index.html")

'verify website is loaded by checking if the username field is present within 15 seconds'
WebUI.verifyElementPresent(findTestObject('Object Repository/Login Feature/input_username'), 15)

'Take a screenshot of the current page for reference'
WebUI.takeScreenshot()

'input username into username field'
WebUI.setText(findTestObject('Object Repository/Login Feature/input_username'), 'standard_user')

'input password into password field'
WebUI.setText(findTestObject('Object Repository/Login Feature/input_password'), 'secret_sauce')

'click login'
WebUI.click(findTestObject('Object Repository/Login Feature/button_login'))

'verify that the user has successfully logged in and now on the shop page'
//WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Page//*[contains(@class="product_label"]'), 15)
//WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Page//*[contains(@class, "product_label")]'), 15)
WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Page//*[contains(@class, "product_label")]'), 15)
 
 
'Take a screenshot of the shop page after login'
WebUI.takeScreenshot()

'Close the browser aster the test'
WebUI.closeBrowser()
*/
'Open browser with link sauce demo'
WebUI.openBrowser("https://www.saucedemo.com/v1/index.html")

'verify website is loaded by checking if the username field is present within 15 seconds'
WebUI.verifyElementPresent(findTestObject('Object Repository/Login Feature/input_username'), 15)

'Take a screenshot of the current page for reference'
WebUI.takeScreenshot()

'input username into username field'
WebUI.setText(findTestObject('Object Repository/Login Feature/input_username'), 'standard_user')

'input password into password field'
WebUI.setText(findTestObject('Object Repository/Login Feature/input_password'), 'secret_sauce')

'click login'
WebUI.click(findTestObject('Object Repository/Login Feature/button_login'))

'verify that the user has successfully logged in and now on the shop page'
//WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Page//[@class='product_label']'), 15)
//WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Page//[@class='product_label']'), 15)
//WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Page//*[contains(@class, "product_label")]'), 15)

'Verifikasi URL setelah login'
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.saucedemo.com/v1/inventory.html')

'Menunggu elemen muncul sebelum memverifikasi'
WebUI.waitForElementPresent(findTestObject('Object Repository/Shop Page//*[contains(@class, "product_label")]'), 15)

'Verifikasi bahwa elemen produk ada di halaman'
WebUI.verifyElementPresent(findTestObject('Object Repository/Shop Page//*[contains(@class, "product_label")]'), 15)


 
'Take a screenshot of the shop page after login'
WebUI.takeScreenshot()

'Close the browser after the test'
WebUI.closeBrowser()




