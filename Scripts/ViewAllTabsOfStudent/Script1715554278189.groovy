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

WebUI.click(findTestObject('AddFamilyMember/Family_Button'))

WebUI.mouseOver(findTestObject('AddFamilyMember/AddFamilyMemeber_Button'))

WebUI.mouseOver(findTestObject('ViewAllTabs/EditFamilyMember_Button'))

WebUI.click(findTestObject('ViewAllTabs/Attendance_Button'))

WebUI.click(findTestObject('ViewAllTabs/OKOfAttendeance_Button'))

WebUI.click(findTestObject('ViewAllTabs/AcademicYearAttendance_List'))

WebUI.click(findTestObject('ViewAllTabs/EnrollmentAttendance_List'))

WebUI.click(findTestObject('ViewAllTabs/TermAttendance_List'))

WebUI.click(findTestObject('ViewAllTabs/GradeBook_Button'))

WebUI.click(findTestObject('ViewAllTabs/AcademicYearGradeBook_List'))

WebUI.click(findTestObject('ViewAllTabs/EnrollmentGradeBook_List'))

WebUI.click(findTestObject('ViewAllTabs/TermGradeBook_List'))

WebUI.click(findTestObject('ViewAllTabs/CourseGradeBook_List'))

WebUI.click(findTestObject('ViewAllTabs/EnrollmentHistory_Button'))

WebUI.click(findTestObject('ViewAllTabs/Document_Button'))

WebUI.click(findTestObject('ViewAllTabs/Page_Emirates Schools Establishment/AdditionalInformation_Button'))

WebUI.click(findTestObject('ViewAllTabs/Page_Emirates Schools Establishment/type_List'))

WebUI.click(findTestObject('ViewAllTabs/Page_Emirates Schools Establishment/SubType_List'))

WebUI.click(findTestObject('ViewAllTabs/Page_Emirates Schools Establishment/AcademicYear_List'))

WebUI.click(findTestObject('ViewAllTabs/Page_Emirates Schools Establishment/Score_TextField'))

WebUI.mouseOver(findTestObject('ViewAllTabs/Page_Emirates Schools Establishment/ChooseFile_Button'))

