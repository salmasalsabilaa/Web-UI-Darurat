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



class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open website Alta shop for login")
	def OpenWebsite() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("I click login icon on dashboard")
	def ClickLoginIconOnDashboard() {
		WebUI.click(findTestObject('Login/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-sign-in theme--dark'))
	}

	@And ("I input valid email in login page")
	def inputValidEmailinLoginPage() {
		WebUI.setText(findTestObject('Login/Page_frontend-web/input_Email_input-5667'), 'john@gmail.com')
	}

	@And ("I input valid password in login page")
	def inputvalidPasswordinLoginPage() {
		WebUI.setText(findTestObject('Login/Page_frontend-web/input_Password_input-5670'), 'J0hnD_')
	}

	@And("I clik login button on login page")
	def ClickLoginButtonOnLogin() {
		WebUI.click(findTestObject('Login/Page_frontend-web/button_Login'))
	}

	@And("I input (.*) in field email in login page")
	def inputEmailinLoginPage(String email) {
		WebUI.setText(findTestObject('Login/Page_frontend-web/input_Email_input-5667'), email)
	}

	@And("I input (.*) in field password in login page")
	def inputPasswordinLoginPage(String password) {
		WebUI.setText(findTestObject('Login/Page_frontend-web/input_Password_input-5670'), password)
	}

	@Then ("I able to see alert in login page")
	def AbleSeeAlertinLoginPage() {
		WebUI.check(findTestObject('Login/Page_frontend-web/div_email is required'))
	}

	@Then("I able to direct to dashboard")
	def DirectToDashboard() {
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}
}