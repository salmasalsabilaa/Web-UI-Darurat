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

WebUI.navigateToUrl('https://alta-shop.vercel.app/')

WebUI.click(findTestObject('Transaction/Page_frontend-web/button_Beli1'))

WebUI.click(findTestObject('Transaction/Page_frontend-web/button_Beli2'))

WebUI.click(findTestObject('Transaction/Page_frontend-web/cart-icon'))

WebUI.click(findTestObject('Transaction/Page_frontend-web/button-add qty1'))

WebUI.check(findTestObject('Transaction/Page_frontend-web/Page_frontend-web/qty product 1'))

WebUI.click(findTestObject('Transaction/Page_frontend-web/button_reduceqty2'))

WebUI.check(findTestObject('Transaction/Page_frontend-web/Page_frontend-web/qty product 2'))

WebUI.click(findTestObject('Transaction/Page_frontend-web/button_reduceqty1'))

WebUI.check(findTestObject('Transaction/Page_frontend-web/Page_frontend-web/div_Order is empty'))

WebUI.click(findTestObject('Transaction/Page_frontend-web/button_Bayar'))

WebUI.setText(findTestObject('Transaction/Page_frontend-web/input_Email_input-5699'), 'john@gmail.com')

WebUI.setText(findTestObject('Transaction/Page_frontend-web/input_Password_input-5702'), 'J0hnD_')

WebUI.click(findTestObject('Transaction/Page_frontend-web/button_Login'))

WebUI.check(findTestObject('Transaction/Page_frontend-web/h1_Transactions-history'))

WebUI.click(findTestObject('Transaction/Page_frontend-web/user-icon'))

WebUI.click(findTestObject('Transaction/Page_frontend-web/div_Transaksi'))

WebUI.check(findTestObject('Transaction/Page_frontend-web/h1_Transactions-history'))

WebUI.navigateToUrl('https://alta-shop.vercel.app/transaction')

