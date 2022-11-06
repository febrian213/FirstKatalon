import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

/**
 * This is an example of how to use Visual Testing. See tutorial at 
 * https://forum.katalon.com/t/update-with-katalon-studio-7-7-early-release-of-katalon-testops-visual-testing-image-comparison/45557.
 */
WebUI.openBrowser('')

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_Dismiss'))

WebUI.click(findTestObject('Object Repository/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__username'), 'dwifebrianramadhan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__password'), 'qwerty12345')

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__rememberme'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/a_Search'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    'dress')

WebUI.sendKeys(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search Results for dress  ToolsQA Demo Site/img_Browse Wishlist_product-one-thumb'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ShopDemoQA/Page_white bandage cut out bodycon mini dre_228afb/select_Choose an optionWhite'), 
    'white', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ShopDemoQA/Page_white bandage cut out bodycon mini dre_228afb/select_Choose an optionLargeMediumSmallX-Large'), 
    'x-large', true)

WebUI.click(findTestObject('Object Repository/Page_ShopDemoQA/Page_white bandage cut out bodycon mini dre_228afb/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_ShopDemoQA/Page_white bandage cut out bodycon mini dre_228afb/a_Search'))

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    'dress')

WebUI.sendKeys(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input_Type and Press Enter to Search_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Search Results for dress  ToolsQA Demo Site/img_Add to Wishlist_product-one-thumb_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_black satin one shoulder cut out midi _f65846/select_Choose an optionBlack'), 
    'black', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_black satin one shoulder cut out midi _f65846/select_Choose an optionLargeMediumSmall'), 
    'small', true)

WebUI.click(findTestObject('Object Repository/Page_black satin one shoulder cut out midi _f65846/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_black satin one shoulder cut out midi _f65846/a_View cart'))

WebUI.click(findTestObject('Object Repository/Page_ShopDemoQA/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 'dwi febrian')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 'ramadhan')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 'juara coding')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_Indonesia'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 'jalan sawo')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_address_2'), 'pasar rebo')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'jakarta timur')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/span_Jawa Barat'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), '13780')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '0878787878')

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.closeBrowser()

