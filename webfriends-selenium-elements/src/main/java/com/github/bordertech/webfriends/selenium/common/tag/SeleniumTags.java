package com.github.bordertech.webfriends.selenium.common.tag;

import com.github.bordertech.webfriends.selenium.common.tags.STagA;
import com.github.bordertech.webfriends.selenium.common.tags.STagAudio;
import com.github.bordertech.webfriends.selenium.common.tags.STagBody;
import com.github.bordertech.webfriends.selenium.common.tags.STagButton;
import com.github.bordertech.webfriends.selenium.common.tags.STagDatalist;
import com.github.bordertech.webfriends.selenium.common.tags.STagDialog;
import com.github.bordertech.webfriends.selenium.common.tags.STagDiv;
import com.github.bordertech.webfriends.selenium.common.tags.STagFieldSet;
import com.github.bordertech.webfriends.selenium.common.tags.STagFigure;
import com.github.bordertech.webfriends.selenium.common.tags.STagFooter;
import com.github.bordertech.webfriends.selenium.common.tags.STagForm;
import com.github.bordertech.webfriends.selenium.common.tags.STagH1;
import com.github.bordertech.webfriends.selenium.common.tags.STagH2;
import com.github.bordertech.webfriends.selenium.common.tags.STagH3;
import com.github.bordertech.webfriends.selenium.common.tags.STagH4;
import com.github.bordertech.webfriends.selenium.common.tags.STagH5;
import com.github.bordertech.webfriends.selenium.common.tags.STagH6;
import com.github.bordertech.webfriends.selenium.common.tags.STagHead;
import com.github.bordertech.webfriends.selenium.common.tags.STagHeader;
import com.github.bordertech.webfriends.selenium.common.tags.STagHtml;
import com.github.bordertech.webfriends.selenium.common.tags.STagImg;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputCheckbox;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputColor;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputDate;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputDateTime;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputEmail;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputFileUpload;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputNumber;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputPassword;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputRadio;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputRange;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputSearch;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputTelephone;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputText;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputUrl;
import com.github.bordertech.webfriends.selenium.common.tags.STagLabel;
import com.github.bordertech.webfriends.selenium.common.tags.STagUnorderedListItem;
import com.github.bordertech.webfriends.selenium.common.tags.STagMenu;
import com.github.bordertech.webfriends.selenium.common.tags.STagMenuItem;
import com.github.bordertech.webfriends.selenium.common.tags.STagMeter;
import com.github.bordertech.webfriends.selenium.common.tags.STagNav;
import com.github.bordertech.webfriends.selenium.common.tags.STagOptGroup;
import com.github.bordertech.webfriends.selenium.common.tags.STagOption;
import com.github.bordertech.webfriends.selenium.common.tags.STagOrderedList;
import com.github.bordertech.webfriends.selenium.common.tags.STagParagraph;
import com.github.bordertech.webfriends.selenium.common.tags.STagProgress;
import com.github.bordertech.webfriends.selenium.common.tags.STagSection;
import com.github.bordertech.webfriends.selenium.common.tags.STagSelect;
import com.github.bordertech.webfriends.selenium.common.tags.STagSource;
import com.github.bordertech.webfriends.selenium.common.tags.STagSpan;
import com.github.bordertech.webfriends.selenium.common.tags.STagTD;
import com.github.bordertech.webfriends.selenium.common.tags.STagTH;
import com.github.bordertech.webfriends.selenium.common.tags.STagTR;
import com.github.bordertech.webfriends.selenium.common.tags.STagTable;
import com.github.bordertech.webfriends.selenium.common.tags.STagTextArea;
import com.github.bordertech.webfriends.selenium.common.tags.STagTitle;
import com.github.bordertech.webfriends.selenium.common.tags.STagTrack;
import com.github.bordertech.webfriends.selenium.common.tags.STagUnorderedList;
import com.github.bordertech.webfriends.selenium.common.tags.STagVideo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Standard HTML tag types.
 */
public class SeleniumTags {

	/**
	 * Map HTML tag name to selenium tag types.
	 */
	public static final Map<String, List<TagTypeSelenium>> HTML_TAG_MAP = new HashMap<>();

	public static final STagA A = new STagA();
	public static final STagAudio AUDIO = new STagAudio();
	public static final STagBody BODY = new STagBody();
	public static final STagButton BUTTON = new STagButton();
	public static final STagDatalist DATALIST = new STagDatalist();
	public static final STagDialog DIALOG = new STagDialog();
	public static final STagDiv DIV = new STagDiv();
	public static final STagFieldSet FIELDSET = new STagFieldSet();
	public static final STagFigure FIGURE = new STagFigure();
	public static final STagFooter FOOTER = new STagFooter();
	public static final STagForm FORM = new STagForm();
	public static final STagH1 H1 = new STagH1();
	public static final STagH2 H2 = new STagH2();
	public static final STagH3 H3 = new STagH3();
	public static final STagH4 H4 = new STagH4();
	public static final STagH5 H5 = new STagH5();
	public static final STagH6 H6 = new STagH6();
	public static final STagHead HEAD = new STagHead();
	public static final STagHeader HEADER = new STagHeader();
	public static final STagHtml HTML = new STagHtml();
	public static final STagImg IMG = new STagImg();
	public static final STagInputCheckbox INPUT_CHECKBOX = new STagInputCheckbox();
	public static final STagInputColor INPUT_COLOR = new STagInputColor();
	public static final STagInputDate INPUT_DATE = new STagInputDate();
	public static final STagInputDateTime INPUT_DATETIME = new STagInputDateTime();
	public static final STagInputEmail INPUT_EMAIL = new STagInputEmail();
	public static final STagInputFileUpload INPUT_FILEUPLOAD = new STagInputFileUpload();
	public static final STagInputNumber INPUT_NUMBER = new STagInputNumber();
	public static final STagInputPassword INPUT_PASSWORD = new STagInputPassword();
	public static final STagInputRadio INPUT_RADIO = new STagInputRadio();
	public static final STagInputRange INPUT_RANGE = new STagInputRange();
	public static final STagInputSearch INPUT_SEARCH = new STagInputSearch();
	public static final STagInputTelephone INPUT_TELEPHONE = new STagInputTelephone();
	public static final STagInputText INPUT_TEXT = new STagInputText();
	public static final STagInputUrl INPUT_URL = new STagInputUrl();
	public static final STagLabel LABEL = new STagLabel();
	public static final STagUnorderedListItem LISTITEM = new STagUnorderedListItem();
	public static final STagMenu MENU = new STagMenu();
	public static final STagMenuItem MENUITEM = new STagMenuItem();
	public static final STagMeter METER = new STagMeter();
	public static final STagNav NAV = new STagNav();
	public static final STagOrderedList OL = new STagOrderedList();
	public static final STagOptGroup OPTGROUP = new STagOptGroup();
	public static final STagOption OPTION = new STagOption();
	public static final STagParagraph P = new STagParagraph();
	public static final STagProgress PROGRESS = new STagProgress();
	public static final STagSection SECTION = new STagSection();
	public static final STagSelect SELECT = new STagSelect();
	public static final STagSource SOURCE = new STagSource();
	public static final STagSpan SPAN = new STagSpan();
	public static final STagTable TABLE = new STagTable();
	public static final STagTD TD = new STagTD();
	public static final STagTextArea TEXTAREA = new STagTextArea();
	public static final STagTH TH = new STagTH();
	public static final STagTitle TITLE = new STagTitle();
	public static final STagTR TR = new STagTR();
	public static final STagTrack TRACK = new STagTrack();
	public static final STagUnorderedList UL = new STagUnorderedList();
	public static final STagVideo VIDEO = new STagVideo();

	public static final List<TagHeadingTypeSelenium> HEADING_TAGS = Arrays.asList(H1, H2, H3, H4, H5, H6);
	public static final List<TagTypeSelenium> TAGS = Arrays.asList(
			A, AUDIO, BODY, BUTTON, DATALIST, DIALOG, DIV, FIELDSET, FIGURE, FOOTER, FORM, H1, H2, H3, H4, H5, H6,
			HEAD, HEADER, HTML, IMG, INPUT_CHECKBOX, INPUT_COLOR, INPUT_COLOR, INPUT_DATE, INPUT_DATETIME,
			INPUT_EMAIL, INPUT_FILEUPLOAD, INPUT_NUMBER, INPUT_PASSWORD, INPUT_RADIO, INPUT_RADIO,
			INPUT_RANGE, INPUT_SEARCH, INPUT_TELEPHONE, INPUT_TEXT, INPUT_URL,
			LABEL, LISTITEM, MENU, METER, NAV, OL, OPTGROUP, OPTION, P, PROGRESS, SECTION, SELECT, SOURCE, SPAN,
			TABLE, TD, TEXTAREA, TH, TITLE, TR, TRACK,
			UL, VIDEO
	);

	static {
		for (TagTypeSelenium tag : SeleniumTags.TAGS) {
			List<TagTypeSelenium> tags = HTML_TAG_MAP.get(tag.getTagName());
			if (tags == null) {
				tags = new ArrayList<>();
				HTML_TAG_MAP.put(tag.getTagName(), tags);
			}
			tags.add(tag);
		}
	}
}
