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

WebUI.click(findTestObject('EditStudent/Information_Button'))

WebUI.clearText(findTestObject('EditStudent/FirstName_TextField'))

WebUI.setText(findTestObject('EditStudent/FirstName_TextField'), 'توفيق')

WebUI.clearText(findTestObject('EditStudent/FamilyName_TextField'))

WebUI.setText(findTestObject('EditStudent/FamilyName_TextField'), 'مكرم')

WebUI.clearText(findTestObject('EditStudent/EnglishFirstName_TextField'))

WebUI.setText(findTestObject('EditStudent/EnglishFirstName_TextField'), 'Tawfiq')

WebUI.clearText(findTestObject('EditStudent/EnglishFamilyName_TextField'))

WebUI.setText(findTestObject('EditStudent/EnglishFamilyName_TextField'), 'Makram')

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/Country_List'), 'United Arab Emirates', false)

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/State_List'), 'AJMAN', false)

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/City_List'), 'عجمان', false)

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/Region_List'), 'ابراج الامارات', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/Mobile_List'), 'EMail', false)

WebUI.setText(findTestObject('EditStudent/Mobile_TextField'), 'tawfiqmakram22@gmail.com')

WebUI.click(findTestObject('RegisterStudent_Objects/AddMobile_Button'))

WebUI.click(findTestObject('EditStudent/Save_Button'))

WebUI.click(findTestObject('EditStudent/Page_Emirates Schools Establishment/OkAfterEdit_Button'))

WebUI.click(findTestObject('AddFamilyMember/CloseThirdTab_Button'))

WebUI.click(findTestObject('AddFamilyMember/CloseSecondTab_Button'))

