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

WebUI.waitForElementClickable(findTestObject('RegisterStudent_Objects/Registration_Menu'), 0)

WebUI.click(findTestObject('RegisterStudent_Objects/Registration_Menu'))

WebUI.click(findTestObject('RegisterStudent_Objects/Search_Submenu'))

WebUI.click(findTestObject('RegisterStudent_Objects/CreateStudent_Button'))

WebUI.setText(findTestObject('RegisterStudent_Objects/FirstName_TextField'), 'توفيق')

WebUI.setText(findTestObject('RegisterStudent_Objects/FamilyName_TextField'), 'مكرم')

WebUI.setText(findTestObject('RegisterStudent_Objects/EnglishFirstName_TextField'), 'aaaaa')

WebUI.setText(findTestObject('RegisterStudent_Objects/EnglishFamilyName_TextField'), 'bbbbb')

WebUI.setText(findTestObject('RegisterStudent_Objects/BirthDate_TextField'), '22/03/2010')

WebUI.click(findTestObject('RegisterStudent_Objects/BirthDate_TextField'))

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/BirthCountry_List'), 'United Arab Emirates', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/Gender_List'), 'Male', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/Religion_List'), 'Christian', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/Nationality_List'), 'Bahrain', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/NationalityCategory_List'), 'Female UAE Children (Holds Emirates Nationality)', 
    false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/Country_List'), 'United Arab Emirates', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/State_List'), 'DUBAI', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/City_List'), 'دبي', false)

WebUI.click(findTestObject('RegisterStudent_Objects/Region_List'))

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/Region_List'), 'أبوهيل', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/Mobile_List'), 'Mobile', false)

WebUI.setText(findTestObject('RegisterStudent_Objects/Mobile_TextField'), '0505143050')

WebUI.click(findTestObject('RegisterStudent_Objects/AddMobile_Button'))

WebUI.click(findTestObject('RegisterStudent_Objects/Mobile_CheckBox'))

WebUI.scrollToElement(findTestObject('RegisterStudent_Objects/Grade_List'), 15)

WebUI.setText(findTestObject('RegisterStudent_Objects/School_TextField'), 'Al-Rash')

WebUI.waitForElementClickable(findTestObject('RegisterStudent_Objects/option_Al-Rashedia Boys School - Cycle 3'), 15)

WebUI.click(findTestObject('RegisterStudent_Objects/option_Al-Rashedia Boys School - Cycle 3'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/EntryType_List'), 'Promoted', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/Grade_List'), 'Grade 9 General', false)

WebUI.click(findTestObject('RegisterStudent_Objects/Save_Button'))

WebUI.click(findTestObject('RegisterStudent_Objects/SaveAnyWay_Button'))

WebUI.click(findTestObject('RegisterStudent_Objects/Page_Emirates Schools Establishment/YesAfterSaveStudent_Button'))

WebUI.uploadFile(findTestObject('RegisterStudent_Objects/Page_Emirates Schools Establishment/input_Upload Attachment_File1'), 
    'C:\\\\Users\\Tawfiq Makram\\Downloads\\Test Automation Assignment.pdf')

WebUI.uploadFile(findTestObject('RegisterStudent_Objects/Page_Emirates Schools Establishment/input_Upload Attachment_File2'), 
    'C:\\\\Users\\Tawfiq Makram\\Downloads\\Test Automation Assignment.pdf')

WebUI.click(findTestObject('RegisterStudent_Objects/Page_Emirates Schools Establishment/SaveAfterUpload_Button'))

