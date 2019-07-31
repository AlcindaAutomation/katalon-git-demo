import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://executeautomation.com/demosite/Login.html')

WebUI.setText(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/input_Login_UserName'), 'admin')

WebUI.setText(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/input_Login_Password'), 'admin')

WebUI.click(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/input_Login_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/select_SelectMrMs'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/input_Initial_Initial'), 'Kk')

WebUI.setText(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/input__FirstName'), 'Kirthik')

WebUI.setText(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/input_Middle Name_MiddleName'), 
    'MiddleName')

WebUI.click(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/input_EnglishHindi_Hindi'))

WebUI.click(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/input_EnglishHindi_english'))

WebUI.click(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/td'))

WebUI.click(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/a_HtmlPopup'))

WebUI.switchToWindowTitle('Popup Window')

WebUI.selectOptionByValue(findTestObject('Object Repository/LoginTest 01_OR/Page_Popup Window/select_SelectMrMs'), '2', 
    true)

WebUI.setText(findTestObject('Object Repository/LoginTest 01_OR/Page_Popup Window/input_Initial_Initial'), 'Initial')

WebUI.setText(findTestObject('Object Repository/LoginTest 01_OR/Page_Popup Window/input__FirstName'), 'FirstName')

WebUI.setText(findTestObject('Object Repository/LoginTest 01_OR/Page_Popup Window/input_Middle Name_MiddleName'), 'MiddleName')

WebUI.setText(findTestObject('Object Repository/LoginTest 01_OR/Page_Popup Window/input__LastName'), 'LastName')

WebUI.click(findTestObject('Object Repository/LoginTest 01_OR/Page_Popup Window/input_GenderMaleFemale_Female'))

WebUI.switchToWindowTitle('Execute Automation')

WebUI.click(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/input_Click for Generating JavaScript Alert_generate'))

WebUI.click(findTestObject('Object Repository/LoginTest 01_OR/Page_Execute Automation/input_Click for Generating JavaScript Alert_generate'))

WebUI.closeBrowser()

