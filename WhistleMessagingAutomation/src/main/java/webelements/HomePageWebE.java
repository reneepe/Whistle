package webelements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageWebE
{

	/** Enter value in Gust Name textbox */
	@FindBy(id = "new-convo-guest-name")
	public WebElement		txt_GuestName;

	/** to click on Search result */
	@FindBy(xpath = "//div[@class='SearchResultsContainer SearchResultsContainer--open']//div")
	public List<WebElement>	lst_SearchResults;

	/** to enter value in Phone number */
	@FindBy(id = "phone_1")
	public WebElement		txt_PhoneNo;

	/** to click on Arrival Date textbox */
	@FindBy(id = "new-convo-arrival")
	public WebElement		txt_ArrivalDate;

	/** to click on Departure Date textbox */
	@FindBy(id = "new-convo-departure")
	public WebElement		txt_DepartureDate;

	/** to click on year label in date calendar */
	@FindBy(xpath = "(//div[@direction='up']//div)[1]")
	public WebElement		lnk_Year;

	/** to enter value in Notes */
	@FindBy(id = "new-convo-notes")
	public WebElement		txt_Notes;

	/** to enter value in Email ID */
	@FindBy(id = "new-convo-email")
	public WebElement		txt_Email;

	/** to enter value in message textbox */
	@FindBy(id = "main_start_convo_msg_box")
	public WebElement		txt_Message;

	/** to click on Send button */
	@FindBy(xpath = "(//div[@class='SendMessageButton'])[2]")
	public WebElement		btn_Send;

	/** to click on Send button */
	@FindBy(xpath = "(//div[@class='SendMessageButton'])[1]")
	public WebElement		btn_SendConversation;

	/** to get the value of Month */
	@FindBy(xpath = "//div[@style='height: inherit; padding-top: 12px;']")
	public WebElement		lbl_Month;

	/** to click on Left pointer of Calendar */
	@FindBy(xpath = "/html/body/div[13]/div/div[1]/div/div/div/div/div[2]/div[1]/div[1]/button[1]")
	public WebElement		lnk_Left_Pointer;

	/** to click on Right pointer of Calendar */
	@FindBy(xpath = "/html/body/div[13]/div/div[1]/div/div/div/div/div[2]/div[1]/div[1]/button[2]")
	public WebElement		lnk_Right_Pointer;

	/** to click on Left pointer of Calendar */
	@FindBy(xpath = "/html/body/div[14]/div/div[1]/div/div/div/div/div[2]/div[1]/div[1]/button[1]")
	public WebElement		lnk_Left_Pointer_Depart;

	/** to click on Right pointer of Calendar */
	@FindBy(xpath = "/html/body/div[14]/div/div[1]/div/div/div/div/div[2]/div[1]/div[1]/button[2]")
	public WebElement		lnk_Right_Pointer_Depart;

	/** to click on Left pointer of Calendar */
	@FindBy(xpath = "(//button[contains(@style,'overflow: visible')])[1]")
	public WebElement		lnk_Left_Pointer_Reservation;

	/** to click on Right pointer of Calendar */
	@FindBy(xpath = "(//button[contains(@style,'overflow: visible')])[2]")
	public WebElement		lnk_Right_Pointer_Reservation;

	/** to click on Left pointer of Calendar */
	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div/div/div/div[2]/div[1]/div[1]/button[1]")
	public WebElement		lnk_Left_Pointer_Depart_Reservation;

	/** to click on Right pointer of Calendar */
	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div/div/div/div[2]/div[1]/div[1]/button[2]")
	public WebElement		lnk_Right_Pointer_Depart_Reservation;

	/** to check Middle Panel after Click on Send button */
	@FindBy(css = ".ChatMessage__message--bubble.currentUser > span")
	public List<WebElement>	lbl_Messages;

	/** to click on Whistle Hotel dropdown */
	@FindBy(css = ".brand-logo__company-name")
	public WebElement		lst_WhistleDropdown;

	/** to check Whistle Dropdown open or not */
	@FindBy(css = ".dropdown-content.active")
	public WebElement		lst_ActiveDropdown;

	/** to click on Sound toggle */
	@FindBy(id = "sound")
	public WebElement		ico_SoundToggle;

	/** to click on NOtification toggle */
	@FindBy(id = "notifications")
	public WebElement		ico_NotificationToggel;

	/** to get the background value of Sound Toggle */
	@FindBy(xpath = "((//div[@class='NotificationToggles__toggle'])[1]//div[contains(@style,'background-color')])[1]")
	public WebElement		lbl_ToggleBackground;

	/** to get the background value of Notification Toggle */
	@FindBy(xpath = "((//div[@class='NotificationToggles__toggle'])[2]//div[contains(@style,'background-color')])[1]")
	public WebElement		lbl_NotificationBackground;

	/** to click on Guest Chat left Side */
	@FindBy(id = "guest-chat-tab")
	public WebElement		ico_GuestChat;

	/** to click on Start Conversation button */
	@FindBy(css = ".PrimaryButtonContainer__button.btn")
	public WebElement		btn_StartConversation;

	/** to click on Start Compaign option */
	@FindBy(xpath = "//div[contains(text(),'Start Campaign')]")
	public WebElement		btn_StartCompaign;

	/** to enter description */
	@FindBy(id = "textarea1")
	public WebElement		txt_Description;

	/** to click on Create Survey button */
	@FindBy(xpath = "//span[text()='Create Survey']")
	public WebElement		btn_CreateSurvey;

	/** to click on File Upload button */
	@FindBy(xpath = "//input[contains(@id,'FileUploader')]")
	public WebElement		btn_FileUpload;

	/** to click on Add Guest button */
	@FindBy(xpath = "(//span[contains(text(),'Add Guest')])[2]")
	public WebElement		btn_AddGuest;

	/** to click on Add Guest button of Campaign */
	@FindBy(xpath = "//span[contains(text(),'Add Guest')]")
	public WebElement		btn_AddGuestCompaign;

	/** to check Compaign message sent or not */
	@FindBy(xpath = "//div[@mode='determinate']")
	public WebElement		compaign_Message;

	/** to enter the values in tables */
	@FindBy(xpath = "//table//div[@class='col input-field s12']//input")
	public List<WebElement>	txt_GuestValues;

	/** to enter message in Compaign messgae */
	@FindBy(id = "campaign_msg_box")
	public WebElement		txt_CompaignMessage;

	/** to click omn Start Survey button */
	@FindBy(xpath = "//div[contains(text(),'Start Survey')]")
	public WebElement		btn_StartSurvey;

	/** to click on Use Survey Template button */
	@FindBy(css = ".chip.selected.add")
	public WebElement		btn_UseSurveyTemplate;

	/** to select first template from Template window */
	@FindBy(xpath = "(//div[@id='survey-template-modal']//span)[1]")
	public WebElement		lnk_FIrstTemplate;

	/** to click on Next button */
	@FindBy(xpath = "//button[text()='Next']")
	public WebElement		btn_NextSurvey;

	/** to click on Send Survey button */
	@FindBy(xpath = "//button[text()='Send Survey']")
	public WebElement		btn_SendSurvey;

	/** to check Survey Sent label */
	@FindBy(css = ".StartSurveyView__finished.animated.slideInRight")
	public WebElement		lbl_SurveySent;

	/** to add Survey Question */
	@FindBy(id = "new-survey-template-question")
	public WebElement		txt_Survey_Question;

	/** to click on Answer Type dropdown */
	@FindBy(id = "new-survey-template-answer-type")
	public WebElement		lst_AnswerType;

	/** to Select Range option */
	@FindBy(xpath = "//div[text()='Range']")
	public WebElement		lst_Range;

	/** to add value in Start Range */
	@FindBy(id = "new-survey-template-range-start")
	public WebElement		txt_StartRange;

	/** to add value in End Range */
	@FindBy(id = "new-survey-template-range-end")
	public WebElement		txt_EndRange;

	/** to click on Add Answer option button */
	@FindBy(xpath = "//div[contains(text(),'Add Answer Option')]")
	public WebElement		btn_AddAnswerQuestion;

	/** to enter value in new Choice */
	@FindBy(id = "new-survey-template-choice-2")
	public WebElement		txt_Choice;

	/** to get the list of Open Conversation */
	@FindBy(css = ".ConversationList__convo")
	public List<WebElement>	conversation_list;

	/** to scroll the conversation */
	@FindBy(css = ".GuestChatSidebar__department-container.has-segment")
	public WebElement		scrollbar_Conversation;

	/** to click on Close chat option */
	@FindBy(css = ".ConversationInfoHeader__action")
	public WebElement		ico_CloseChat;

	/** to get the list of conversartion name */
	@FindBy(css = ".PhoneNumber")
	public List<WebElement>	lbl_Names;

	/** to click on Archived tab */
	@FindBy(xpath = "//div[text()='Archive']")
	public WebElement		tab_Archived;

	/** to check Archive list Row */
	@FindBy(css = ".ArchiveList__row")
	public List<WebElement>	lst_Archive;

	/** to scroll the Archive Container */
	@FindBy(xpath = "//div[@class='ArchiveContainer z-depth-2']")
	public WebElement		scrollBar_Archive;

	/** to click on Block/Unblock button */
	@FindBy(css = ".btn.waves-effect.red")
	public WebElement		btn_BlockUnblock;

	/** to click on Confirm button */
	@FindBy(css = "#blockModal .confirm.delete")
	public WebElement		btn_Confirm;

	/** to click on Blocked tab */
	@FindBy(xpath = "//div[text()='Blocked']")
	public WebElement		tab_Blocked;

	/** to click on First row from Blocked Container */
	@FindBy(xpath = "(//table[contains(@class,'Table')]//tr[@class='ArchiveList__row']//td)[1]")
	public WebElement		first_Blocked;

	/** to click on Live chat icon */
	@FindBy(id = "live-chat-tab")
	public WebElement		ico_Live_Chat;

	/** to scroll Live Chat Conversartions */
	@FindBy(css = ".LiveChatLeftSidebarContainer__list.has-segment")
	public WebElement		scrollbar_LiveChat;

	/** to get the names of Live Chat */
	@FindBy(css = ".info__name")
	public List<WebElement>	lbl_LiveChatNames;

	/** to click on Team Chat icon */
	@FindBy(id = "team-chat-tab")
	public WebElement		ico_TeamChat;

	/** to click on Create channel button */
	@FindBy(css = ".PrimaryButtonContainer__button.btn")
	public WebElement		btn_CreateChannel;

	/** to enter Channel name */
	@FindBy(xpath = "//div[@id='editmodal_new']//input")
	public WebElement		txt_ChannelName;

	/** to select Member name from list */
	@FindBy(css = ".List__item-content")
	public List<WebElement>	lbl_TeamMembers;

	/** to click on Confirm button to Create Channel */
	@FindBy(css = "#editmodal_new .confirm.create")
	public WebElement		btn_ConfirmChannel;

	/** to get the list of team members after create it */
	@FindBy(xpath = "//li[@class='TeamChatMemberPanel__list-item']//a[contains(@href,'direct-chat')]")
	public List<WebElement>	lbl_ConfirmMembers;

	/** to click on Plus icon to add new members in channel */
	@FindBy(css = ".TeamChatMemberPanel__add.btn-flat.waves-effect")
	public WebElement		ico_AddMembers;

	/** to click on Remove icon of Channel */
	@FindBy(css = ".TeamChatMemberPanel__remove.btn-flat.waves-effect")
	public WebElement		ico_RemoveChannel;

	/** to add new team members */
	@FindBy(xpath = "//h4[text()='Add Users']/..//div[@class='List__item-content']")
	public List<WebElement>	lbl_NewMembers;

	/** to click on Confirm button of New Team */
	@FindBy(css = "#add_users .confirm.create")
	public WebElement		btn_NewConfirm;

	/** to click on Remove icon of Team members */
	@FindBy(css = ".material-icons.remove_participant")
	public List<WebElement>	ico_Delete;

	/** to click on Confirm button of Remove Team mebers */
	@FindBy(css = "#removeParticipant .confirm.delete")
	public WebElement		btn_ConfirmRemove;

	/** to get the channel name */
	@FindBy(xpath = "//ul[@class='TeamChatSidebar__list']//a[contains(@href,'team-chat')]")
	public List<WebElement>	lbl_ChannelName;

	/** to click on Confirm button of Channel */
	@FindBy(css = "#deleteChannel .confirm.delete")
	public WebElement		btn_ConfirmChannelRemove;

	/** to click on Add Template button */
	@FindBy(css = ".InsertButton")
	public WebElement		ico_InsertTemplate;

	/** to click on Insert Template button */
	@FindBy(xpath = "//div[contains(text(),'Insert Template')]")
	public WebElement		btn_InsertTemlpate;

	/** to click on Template from Pop-up */
	@FindBy(css = ".TemplateModal__template-text")
	public List<WebElement>	list_Templates;

	/** to check template added or not */
	@FindBy(css = ".ChatMessage__message--bubble.currentUser > span")
	public List<WebElement>	lbl_Templates;

	/** to click on Setting icon */
	@FindBy(css = ".ChatMessage__settings")
	public WebElement		ico_Setting;

	/** to click on Direct Chat icon from Left Panel */
	@FindBy(id = "direct-chat-tab")
	public WebElement		ico_DirectChat;

	/** to click on Team members from Direct Chat */
	@FindBy(css = ".DirectChatSidebar__list__item")
	public List<WebElement>	lnk_TeamMember;

	/** to enter message in Direct message */
	@FindBy(css = ".ChatMessageBox__input")
	public WebElement		txt_DirectMessage;

	/** to get the message which sent to direcrt chat */
	@FindBy(css = ".ChatMessage__message--bubble.currentUser > span")
	public List<WebElement>	lbl_DirectMessage;

	/** to click on search icon */
	@FindBy(css = ".SearchBox")
	public WebElement		ico_Search;

	/** to enter value in Search box */
	@FindBy(css = ".SearchBox  input")
	public WebElement		txt_SearchBox;

	/** to click on Clear icon in Search box */
	@FindBy(css = ".closeIcon")
	public WebElement		ico_Clear;

	/** to click on Log Sheet icon */
	@FindBy(id = "logsheets-tab")
	public WebElement		ico_LogSheet;

	/** to click on Add Button */
	@FindBy(xpath = "//button[text()='Add']")
	public WebElement		btn_AddLogSheet;

	/** to click on Filter button */
	@FindBy(xpath = "//button[text()='Filter']")
	public WebElement		btn_Filter;

	/** to click on Edit Columns button */
	@FindBy(xpath = "//button[text()='Edit Columns']")
	public WebElement		btn_EditColumns;

	/** to check Log sheet has been added or not */
	@FindBy(xpath = "(//div[@class='react-grid-Cell__value'])[1]")
	public WebElement		log_Sheet;

	/** to enter value in Search */
	@FindBy(xpath = "(//input[@placeholder='Search'])[1]")
	public WebElement		txt_FilterSearch;

	/** to click on Add Column button */
	@FindBy(xpath = "//button[text()='Add Column']")
	public WebElement		btn_AddColumns;

	/** to get the columns size in Log Sheet */
	//@FindBy(css = ".react-grid-Main .widget-HeaderCell__value")
	@FindBy(xpath = "(//div[@class='react-grid-HeaderRow'])[1]//div[@class='widget-HeaderCell__value']")
	public List<WebElement>	columns_Size;

	/** to scroll the page Horizontally */
	@FindBy(css = ".react-grid-Canvas")
	public WebElement		scroll_Horizontal;

	/** to input the values in New Columns */
	@FindBy(css = ".widget-HeaderCell__value > div > input")
	public List<WebElement>	txt_Columns;

	/** to click on Save button */
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement		btn_SaveColumnn;

	/** to check Column added or not */
	@FindBy(css = ".react-grid-HeaderCell-sortable")
	public List<WebElement>	lbl_Columns;

	/** to click on translate icon */
	@FindBy(css = ".gtranslate-logo")
	public WebElement		ico_Translate;

	/** to click on Translate TO button */
	@FindBy(xpath = "//button[text()='Translate to']")
	public WebElement		btn_TranslateTo;

	/** to click on Translte dropdown */
	@FindBy(xpath = "//div[contains(@id,'undefined--undefined')]")
	public WebElement		lst_Translte;

	/** to get the list of Translate languages */
	@FindBy(xpath = "//span[@role='menuitem']//div[@style]//div")
	public List<WebElement>	lbl_Languages;

	/** to click on Remove button */
	@FindBy(css = ".full-width.btn-red.btn-dark.centered-element")
	public List<WebElement>	ico_Remove;

	/** to click on Relace button */
	@FindBy(css = ".full-width.btn-green.btn-dark.centered-element")
	public WebElement		btn_Replace;

	/** to click on Analytics tab */
	@FindBy(id = "analytics-tab")
	public WebElement		ico_Analytics;

	/** to click on Start Date */
	@FindBy(id = "startDateTimePicker")
	public WebElement		txt_StartDate;

	/** to click on End Date */
	@FindBy(id = "endDateTimePicker")
	public WebElement		txt_EndDate;

	/** to click on Month in Date picker */
	@FindBy(xpath = "(//div[@class='datepicker--nav-title'])[2]")
	public WebElement		lnk_Month;

	/** to click on Month in Date picker */
	@FindBy(xpath = "(//div[@class='datepicker--nav-title'])[1]")
	public WebElement		lnk_Month_EndDate;;

	/** to scroll the Analytics page */
	@FindBy(css = ".Panel.OnePanel.z-depth-2.scrollable")
	public WebElement		analytics_Scroll;

	/** to click on Aggregate radio button */
	@FindBy(xpath = "//input[@value = 'aggregate']")
	public WebElement		rdo_Aggregate;

	/** to click on inbound radio button */
	@FindBy(xpath = "//input[@value = 'inbound']")
	public WebElement		rdo_Inbound;

	/** to click on Reply radio button */
	@FindBy(xpath = "//input[@value = 'reply']")
	public WebElement		rdo_Reply;

	/** to click on Composition button */
	@FindBy(xpath = "//input[@value = 'composition']")
	public WebElement		rdo_Composition;

	/** to check table is displayed or not */
	@FindBy(css = ".Table.undefined")
	public WebElement		tbl_Analytics;

	/** to check table contents */
	@FindBy(css = ".Table.undefined > thead > tr > th")
	public List<WebElement>	tbl_Contents;

	/** to click on Reservation Tab */
	@FindBy(id = "reservations-tab")
	public WebElement		ico_Reservation;

	/** to check Reservation Header */
	@FindBy(css = ".ReservationsList__header")
	public WebElement		lbl_ReservationHeader;

	/** to click on Add Reservation BUtton */
	@FindBy(xpath = "//span[text()='Add Reservation']")
	public WebElement		btn_Reservation;

	/** to enter value in Reservation ID */
	@FindBy(id = "integration_reservation_id")
	public WebElement		txt_ReservationId;

	/** to enter value in Room Number */
	@FindBy(id = "room_number")
	public WebElement		txt_RoomNumber;

	/** to Enter value in First Name */
	@FindBy(id = "first_name")
	public WebElement		txt_FirstName;

	/** to enter value in Last Name */
	@FindBy(id = "last_name")
	public WebElement		txt_LastName;

	/** to click on Arrival textbox */
	@FindBy(id = "arrival")
	public WebElement		txt_Arrival;

	/** to click on Deprture textbox */
	@FindBy(id = "departure")
	public WebElement		txt_Departure;

	/** to enter value in Phone textbox */
	@FindBy(xpath = "//input[contains(@id,'phone')]")
	public WebElement		txt_Phone;

	/** to enter value in email textbox */
	@FindBy(id = "email")
	public WebElement		txt_EmailID;

	/** to click on Save button */
	@FindBy(css = ".ActionButton.btn.waves-effect.waves-light.right.danger.undefined")
	public WebElement		btn_Save;

	/** to get the list of Reservation ID */
	@FindBy(xpath = "//div[@class='column ReservationsList__id']")
	public List<WebElement>	lbl_ReservationID;

	/** to get the list of Room NUmber */
	@FindBy(xpath = "(//a[@class='ReservationsList__Columns']//div)[2]")
	public WebElement		lbl_RoomNumber;

	/** to get he list of Checkboxes */
	@FindBy(xpath = "//div[@class='ReservationsList__select']//input")
	public List<WebElement>	chk_Reservation;

	/** to click on Delete button */
	@FindBy(css = ".btn.waves-effect.red")
	public WebElement		btn_Delete;

	/** to click on Confirm Delete button */
	@FindBy(css = ".confirm.delete")
	public WebElement		btn_ConfirmDelete;

	/** to enter value in search bar */
	@FindBy(id = "search")
	public WebElement		txt_SearchReservation;

	/** to click on Upload button */
	@FindBy(xpath = "//input[contains(@id,'FileUploader')]")
	public WebElement		btn_UploadReservation;

	/** to click on Company icon */
	@FindBy(id = "company-tab")
	public WebElement		ico_Company;

	/** to get the menu of Left Navigation Panel */
	@FindBy(css = ".NavigationSidebar__ListItem > a")
	public List<WebElement>	lbl_CompanyMenu;

	/** to Enter Company Details */
	@FindBy(xpath = "//div[@class='card section']//input")
	public List<WebElement>	txt_CompanyDetails;

	/** To check Company Name changed or not In left Navigation Panel */
	@FindBy(css = ".CompanySidebar__company-name")
	public WebElement		lbl_LeftCompanyName;

	/** to Select value in TimeZone dropdown */
	@FindBy(css = ".select-wrapper > ul > li")
	public List<WebElement>	lst_TimeZone;

	/** to click on Add Escalation button */
	@FindBy(css = ".btn.waves-effect.waves-light.right")
	public WebElement		btn_Escalation;

	/** to scroll Setting Page */
	@FindBy(css = ".Panel.SettingsPanel")
	public WebElement		scrollbar_Setting;

	/** to enter value in Name Field of Escalation Window */
	@FindBy(xpath = "//div[@class='EscalationModal']//label[contains(text(),'Name')]/..//input")
	public WebElement		txt_EscalationName;

	/** to enter value in Phone number of escaltion Window */
	@FindBy(xpath = "//div[@class='PhoneInput']//input")
	public WebElement		txt_EscalationPhone;

	/** to click on toggle in Escalation Window */
	@FindBy(xpath = "//div[@class='row flex-center']//input[@type='checkbox']")
	public List<WebElement>	chk_Toggle;

	/** to click on textbox of Start Time */
	@FindBy(xpath = "//input[contains(@id,'undefined-Pickatime-StartTime')]")
	public List<WebElement>	txt_StartTime;

	/** to click on textbox of End Time */
	@FindBy(xpath = "//input[contains(@id,'undefined-Pickatime-EndTime')]")
	public List<WebElement>	txt_EndTime;

	/** to click on Confirm button */
	@FindBy(css = ".ActionButton.modal-action.waves-effect.btn-flat.confirm.create")
	public WebElement		btn_EscalationConfirm;

	/** to click on Edit button */
	@FindBy(css = ".btn.waves-effect.waves-light.amber")
	public List<WebElement>	btn_EscalationEdit;

	/** to click on Remove button */
	@FindBy(css = ".btn.waves-effect.waves-light.red")
	public List<WebElement>	btn_EscalationRemove;

	/** to click on Confirm butto */
	@FindBy(xpath = "//div[@id='removeRecipient']//button[contains(@class,'confirm')]")
	public WebElement		btn_EscalationRemoveConfirm;

	/** to get the size of Row of Escalation */
	@FindBy(xpath = "(//div[@class='Settings CompanyContainer']//table)[3]//tbody//tr")
	public List<WebElement>	lst_Escalation;

	/** to Enter value in Department textbox */
	@FindBy(xpath = "//form[@id='new-tag']//input")
	public WebElement		txt_Department;

	/** to click on Submit button */
	@FindBy(css = ".btn.department_button")
	public WebElement		btn_DepartmentSubmit;

	/** to click on Department dropdown */
	@FindBy(css = ".select-wrapper.initialized")
	public WebElement		lst_DepartmentDropdown;

	/** to check message after set default department */
	@FindBy(css = ".toast")
	public WebElement		lbl_DefaultMessage;

	/** to get the list of Department */
	@FindBy(css = ".chip")
	public List<WebElement>	lst_Department;

	/** to click on Close icon of department */
	@FindBy(css = ".closeIcon")
	public List<WebElement>	ico_CloseDepartment;

	/** to click on lsit of dropdown */
	@FindBy(xpath = "//ul[contains(@id,'select-options')]//span")
	public List<WebElement>	lbl_DepartmentList;

	/** to click on Confirm button */
	@FindBy(css = ".ActionButton.modal-action.waves-effect.btn-flat.confirm.delete")
	public WebElement		btn_ConfirmDepartment;

	/** to click on Add New Template button */
	@FindBy(css = ".btn.waves-effect.waves-light.right")
	public WebElement		btn_NewTemplate;

	/** to enter value in Title */
	@FindBy(xpath = "//div[@id='createTemplate']//input")
	public WebElement		txt_TemplateTitle;

	/** to click on Message textbox */
	@FindBy(xpath = "//div[@id='createTemplate']//textarea")
	public WebElement		txt_TemplateMessage;

	/** to check Title of templates */
	@FindBy(xpath = "//div[@class='Panel TemplatesPanel ']//div[@class='row']//input")
	public List<WebElement>	lbl_TemplateTitle;

	/** to check Title of templates */
	@FindBy(xpath = "//div[@class='Panel TemplatesPanel ']//div[@class='row']//textarea")
	public List<WebElement>	lbl_TemplateMessage;

	/** to click on remove icon */
	@FindBy(xpath = "//button[@icon='delete']")
	public List<WebElement>	ico_RemoveTemplate;

	/** to Scroll Template page */
	@FindBy(css = ".Panel.TemplatesPanel")
	public WebElement		scrollbar_Templates;

	static HomePageWebE		Instance	= null;

	public static HomePageWebE getInstance(WebDriver driver)
	{
		if (Instance == null)
		{
			Instance = PageFactory.initElements(driver, HomePageWebE.class);
		}

		return Instance;
	}

}
