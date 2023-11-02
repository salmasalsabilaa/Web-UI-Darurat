import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class TransactionSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given ("I open website Alta shop dashboard to do transaction")
	def OpenWebsiteToTransaction() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("I click beli button on a product in the dashboard")
	def ClickBeliOnDashboard() {
		WebUI.click(findTestObject('Transaction/Page_frontend-web/button_Beli1'))
	}

	@And ("I click beli button on a different product in the dashboard")
	def ClickBeliDiffOnDashboard() {
		WebUI.click(findTestObject('Transaction/Page_frontend-web/button_Beli2'))
	}

	@And ("I click cart icon")
	def ClickCartIcon() {
		WebUI.click(findTestObject('Transaction/Page_frontend-web/cart-icon'))
	}

	@And ("I click + on first product qty")
	def ClickplusbtnFirst() {
		WebUI.click(findTestObject('Transaction/Page_frontend-web/button-add qty1'))
	}

	@Then ("qty product added")
	def QtyAdded() {
		WebUI.check(findTestObject('Transaction/Page_frontend-web/Page_frontend-web/qty product 1'))
	}

	@And ("I click - on second product qty")
	def ClickMinbtnSec() {
		WebUI.click(findTestObject('Transaction/Page_frontend-web/button_reduceqty2'))
	}

	@And ("I click - on first product qty")
	def ClickMinbtnFirst() {
		WebUI.click(findTestObject('Transaction/Page_frontend-web/button_reduceqty1'))
	}

	@Then ("qty second product reduced")
	def QtyReduced2() {
		WebUI.check(findTestObject('Transaction/Page_frontend-web/Page_frontend-web/qty product 2'))
	}

	@And ("qty first product reduced")
	def QtyReduced1() {
		WebUI.check(findTestObject('Transaction/Page_frontend-web/Page_frontend-web/qty product 1'))
	}

	@And ("order is empty showed")
	def OrderEmptyShowed() {
		WebUI.check(findTestObject('Transaction/Page_frontend-web/Page_frontend-web/div_Order is empty'))
	}

	@And ("I click Bayar")
	def ClickBayar() {
		WebUI.click(findTestObject('Transaction/Page_frontend-web/button_Bayar'))
	}

	@And ("I input email to login")
	def InputEmailLogin() {
		WebUI.setText(findTestObject('Transaction/Page_frontend-web/input_Email_input-5699'), 'john@gmail.com')
	}

	@And ("I input Password to login")
	def InputPassLogin() {
		WebUI.setText(findTestObject('Transaction/Page_frontend-web/input_Password_input-5702'), 'J0hnD_')
	}

	@And ("I click login to login")
	def ClickLoginToLogin() {
		WebUI.click(findTestObject('Transaction/Page_frontend-web/button_Login'))
	}

	@And ("I click user icon")
	def ClickUserIcon() {
		WebUI.click(findTestObject('Transaction/Page_frontend-web/user-icon'))
	}

	@And ("I click menu transaction history")
	def clickMenuTransHistory() {
		WebUI.click(findTestObject('Transaction/Page_frontend-web/div_Transaksi'))
	}

	@Then("I go transaction history")
	def TransactionHistory() {
		WebUI.check(findTestObject('Transaction/Page_frontend-web/h1_Transactions-history'))
	}

	@Then ("I go transaction history page")
	def TrsHistoryPage() {
		WebUI.navigateToUrl('https://alta-shop.vercel.app/transaction')
	}
}