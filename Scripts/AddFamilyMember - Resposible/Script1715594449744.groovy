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

WebUI.click(findTestObject('AddFamilyMember/div_Mikchael Hany Mikael Shafiq Abdelmallek'))

WebUI.click(findTestObject('AddFamilyMember/StudentDetails_Button'))

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/Country_List'), 'United Arab Emirates', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/State_List'), 'DUBAI', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/City_List'), 'دبي', false)

WebUI.selectOptionByLabel(findTestObject('RegisterStudent_Objects/Region_List'), 'أبوهيل', false)

WebUI.click(findTestObject('AddFamilyMember/Family_Button'))

WebUI.click(findTestObject('AddFamilyMember/AddFamilyMemeber_Button'))

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/SubType_List'), 'Uncle', false)

WebUI.waitForElementClickable(findTestObject('AddFamilyMember/Page_Emirates Schools Establishment/label'), 30)

WebUI.doubleClick(findTestObject('AddFamilyMember/Page_Emirates Schools Establishment/label'))

WebUI.click(findTestObject('AddFamilyMember/Search_Button'))

WebUI.click(findTestObject('AddFamilyMember/CreatePerson_Button'))

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/PersonType_List'), 'Family', false)

WebUI.setText(findTestObject('AddFamilyMember/FirstName_TextField'), 'مجدي')

WebUI.setText(findTestObject('AddFamilyMember/FamilyName_TextField'), 'هاني')

WebUI.setText(findTestObject('AddFamilyMember/EnglishFirstName_TextField'), 'Mina')

WebUI.setText(findTestObject('AddFamilyMember/EnglishFamilyName_TextField'), 'Magdy')

WebUI.setText(findTestObject('AddFamilyMember/BirthDate_TextField'), '27/02/1980')

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/BirthCountry_List'), 'United Arab Emirates', false)

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/Gender_List'), 'Male', false)

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/Religion_List'), 'Christian', false)

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/Nationality_List'), 'United Arab Emirates', false)

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/Country_List'), 'United Arab Emirates', false)

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/State_List'), 'DUBAI', false)

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/City_List'), 'دبي', false)

WebUI.selectOptionByLabel(findTestObject('AddFamilyMember/Region_List'), 'أبوهيل', false)

WebUI.click(findTestObject('AddFamilyMember/SaveInternal_Button'))

WebUI.click(findTestObject('AddFamilyMember/SaveAnyWay_Button'))

WebUI.click(findTestObject('AddFamilyMember/FamilyMember_Button'))

WebUI.click(findTestObject('AddFamilyMember/SaveExternal_Button'))

WebUI.click(findTestObject('AddFamilyMember/SaveLast_Button'))

