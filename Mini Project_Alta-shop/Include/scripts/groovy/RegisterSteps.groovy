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



class RegisterSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I open website Alta shop")
	def OpenWebsiteAltaShop(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("I click login icon")
	def clickLoginIcon() {
		WebUI.click(findTestObject('Register/Page_frontend-web/LoginBtn'))
	}

	@And("I click register button")
	def clickRegisterButton() {
		WebUI.click(findTestObject('Register/Page_frontend-web/ClickRegister'))
	}

	@And("I input (.*) in field nama_lengkap")
	def inputNamaLengkap(String nama_lengkap) {
		WebUI.setText(findTestObject('Register/Page_frontend-web/input_Nama Lengkap_input-5666'), nama_lengkap)
	}

	@And("I input (.*) in field email")
	def inputEmail(String email) {
		WebUI.setText(findTestObject('Register/Page_frontend-web/input_Email_input-5669'), email)
	}

	@And("I input (.*) in field password")
	def inputPassword(String password) {
		WebUI.setText(findTestObject('Register/Page_frontend-web/input_Password_input-5672'), password)
	}

	@And ("I clik register button")
	def ClickRegisterButton () {
		WebUI.click(findTestObject('Register/Page_frontend-web/RegisterBtn'))
	}

	@Then ("I able to see alert")
	def AbleSeeAlert() {
		WebUI.check(findTestObject('Register/Page_frontend-web/Alert'))
	}

	@And ("I input valid nama_lengkap")
	def inputValidNama_lengkap() {
		WebUI.setText(findTestObject('Register/Page_frontend-web/input_Nama Lengkap_input-5666'), 'John Doe')
	}

	@And ("I input valid email")
	def inputValidEmail() {
		WebUI.setText(findTestObject('Register/Page_frontend-web/input_Email_input-5669'), 'john@gmail.com')
	}

	@And ("I input valid password")
	def inputvalidPassword() {
		WebUI.setText(findTestObject('Register/Page_frontend-web/input_Password_input-5672'), 'J0hnD_')
	}

	@Then ("I able to create new user")
	def AbleToCreateNewUser() {
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}
}