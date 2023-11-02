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



class DashboardSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open website Alta shop dashboard")
	def OpenDashboard() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("I click beli button on a product")
	def ClickBeliBtn() {
		WebUI.click(findTestObject('Dashboard/Page_frontend-web/button_Beli1'))
	}

	@Then("I verify cart icon")
	def VerifyCart() {
		WebUI.check(findTestObject('Dashboard/Page_frontend-web/verifyCart'))
	}

	@And ("I click beli button on same product")
	def ClickBeliOnSameProduct() {
		WebUI.click(findTestObject('Dashboard/Page_frontend-web/button_Beli1'))
	}

	@And ("I click beli button on different product")
	def ClickBeliOnDiffProduct() {
		WebUI.click(findTestObject('Dashboard/Page_frontend-web/button_Beli2'))
	}

	@When ("I click detail button on a product")
	def ClickDetailProduct() {
		WebUI.click(findTestObject('Dashboard/Page_frontend-web/button_Detail'))
	}

	@Then ("I directed to product detail")
	def DirectedToProductDetail() {
		WebUI.check(findTestObject('Dashboard/Page_frontend-web/Product-detail'))
	}

	@When ("I click category doropdown")
	def ClickCategory() {
		WebUI.click(findTestObject('Dashboard/Page_frontend-web/dropdown-category'))
	}

	@And ("I click gaming category")
	def ClickGamingCtg() {
		WebUI.click(findTestObject('Dashboard/Page_frontend-web/category_gaming'))
	}

	@Then ("I see gaming colection items")
	def SeeGamingCtgItems() {
		WebUI.verifyElementVisible(findTestObject('Dashboard/Page_frontend-web/Products-ctg-gaming'), FailureHandling.STOP_ON_FAILURE)
	}

	@When ("I click X on category doropdown")
	def ClickXDropdown() {
		WebUI.click(findTestObject('Dashboard/Page_frontend-web/Btn-X-ctg'))
	}

	@Then ("I directed to dashboard")
	def DirectedToDashboard() {
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}
}