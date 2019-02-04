package com.github.bordertech.webfriends.selenium.common.tag;

import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.selenium.element.document.SHtmlRoot;
import com.github.bordertech.webfriends.selenium.element.embedded.SAudio;
import com.github.bordertech.webfriends.selenium.element.embedded.SImage;
import com.github.bordertech.webfriends.selenium.element.embedded.SSource;
import com.github.bordertech.webfriends.selenium.element.embedded.STrack;
import com.github.bordertech.webfriends.selenium.element.embedded.SVideo;
import com.github.bordertech.webfriends.selenium.element.form.SButton;
import com.github.bordertech.webfriends.selenium.element.form.SForm;
import com.github.bordertech.webfriends.selenium.element.form.SLabel;
import com.github.bordertech.webfriends.selenium.element.form.input.SCheckBox;
import com.github.bordertech.webfriends.selenium.element.form.input.SColorField;
import com.github.bordertech.webfriends.selenium.element.form.input.SDateField;
import com.github.bordertech.webfriends.selenium.element.form.input.SDatetimeField;
import com.github.bordertech.webfriends.selenium.element.form.input.SEmailField;
import com.github.bordertech.webfriends.selenium.element.form.input.SFileUpload;
import com.github.bordertech.webfriends.selenium.element.form.input.SNumberField;
import com.github.bordertech.webfriends.selenium.element.form.input.SPasswordField;
import com.github.bordertech.webfriends.selenium.element.form.input.SRadioButton;
import com.github.bordertech.webfriends.selenium.element.form.input.SRangeField;
import com.github.bordertech.webfriends.selenium.element.form.input.SSearchField;
import com.github.bordertech.webfriends.selenium.element.form.input.STelephoneField;
import com.github.bordertech.webfriends.selenium.element.form.input.STextField;
import com.github.bordertech.webfriends.selenium.element.form.input.SUrlField;
import com.github.bordertech.webfriends.selenium.element.form.other.SFieldSet;
import com.github.bordertech.webfriends.selenium.element.form.other.SMeter;
import com.github.bordertech.webfriends.selenium.element.form.other.SProgress;
import com.github.bordertech.webfriends.selenium.element.form.select.SDatalist;
import com.github.bordertech.webfriends.selenium.element.form.select.SOptGroup;
import com.github.bordertech.webfriends.selenium.element.form.select.SOption;
import com.github.bordertech.webfriends.selenium.element.form.select.SSelect;
import com.github.bordertech.webfriends.selenium.element.form.text.STextArea;
import com.github.bordertech.webfriends.selenium.element.grouping.SDiv;
import com.github.bordertech.webfriends.selenium.element.grouping.SFigure;
import com.github.bordertech.webfriends.selenium.element.grouping.SList;
import com.github.bordertech.webfriends.selenium.element.grouping.SListItem;
import com.github.bordertech.webfriends.selenium.element.grouping.SMenu;
import com.github.bordertech.webfriends.selenium.element.grouping.SMenuItem;
import com.github.bordertech.webfriends.selenium.element.grouping.SOrderedList;
import com.github.bordertech.webfriends.selenium.element.grouping.SParagraph;
import com.github.bordertech.webfriends.selenium.element.interactive.SDialog;
import com.github.bordertech.webfriends.selenium.element.metadata.SHead;
import com.github.bordertech.webfriends.selenium.element.sections.SBody;
import com.github.bordertech.webfriends.selenium.element.sections.SFooter;
import com.github.bordertech.webfriends.selenium.element.sections.SHeader;
import com.github.bordertech.webfriends.selenium.element.sections.SHeading1;
import com.github.bordertech.webfriends.selenium.element.sections.SHeading2;
import com.github.bordertech.webfriends.selenium.element.sections.SHeading3;
import com.github.bordertech.webfriends.selenium.element.sections.SHeading4;
import com.github.bordertech.webfriends.selenium.element.sections.SHeading5;
import com.github.bordertech.webfriends.selenium.element.sections.SHeading6;
import com.github.bordertech.webfriends.selenium.element.sections.SNav;
import com.github.bordertech.webfriends.selenium.element.sections.SSection;
import com.github.bordertech.webfriends.selenium.element.table.SDataCell;
import com.github.bordertech.webfriends.selenium.element.table.SHeaderCell;
import com.github.bordertech.webfriends.selenium.element.table.SRow;
import com.github.bordertech.webfriends.selenium.element.table.STable;
import com.github.bordertech.webfriends.selenium.element.textlevel.SLinkAnchor;
import com.github.bordertech.webfriends.selenium.element.textlevel.SSpan;
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
	public static final Map<String, List<SeleniumTag>> HTML_TAG_MAP = new HashMap<>();

	public static final SeleniumTag<SLinkAnchor> A = new SeleniumDefaultTag<>(SLinkAnchor.class, StandardTags.A);
	public static final SeleniumTag<SAudio> AUDIO = new SeleniumDefaultTag<>(SAudio.class, StandardTags.AUDIO);
	public static final SeleniumTag<SBody> BODY = new SeleniumDefaultTag<>(SBody.class, StandardTags.BODY);
	public static final SeleniumTag<SButton> BUTTON = new SeleniumDefaultTag<>(SButton.class, StandardTags.BUTTON);
	public static final SeleniumTag<SDatalist> DATALIST = new SeleniumDefaultTag<>(SDatalist.class, StandardTags.DATALIST);
	public static final SeleniumTag<SDialog> DIALOG = new SeleniumDefaultTag<>(SDialog.class, StandardTags.DIALOG);
	public static final SeleniumTag<SDiv> DIV = new SeleniumDefaultTag<>(SDiv.class, StandardTags.DIV);
	public static final SeleniumTag<SFieldSet> FIELDSET = new SeleniumDefaultTag<>(SFieldSet.class, StandardTags.FIELDSET);
	public static final SeleniumTag<SFigure> FIGURE = new SeleniumDefaultTag<>(SFigure.class, StandardTags.FIGURE);
	public static final SeleniumTag<SFooter> FOOTER = new SeleniumDefaultTag<>(SFooter.class, StandardTags.FOOTER);
	public static final SeleniumTag<SForm> FORM = new SeleniumDefaultTag<>(SForm.class, StandardTags.FORM);
	public static final SeleniumTag<SHeading1> H1 = new SeleniumDefaultTag<>(SHeading1.class, StandardTags.H1);
	public static final SeleniumTag<SHeading2> H2 = new SeleniumDefaultTag<>(SHeading2.class, StandardTags.H2);
	public static final SeleniumTag<SHeading3> H3 = new SeleniumDefaultTag<>(SHeading3.class, StandardTags.H3);
	public static final SeleniumTag<SHeading4> H4 = new SeleniumDefaultTag<>(SHeading4.class, StandardTags.H4);
	public static final SeleniumTag<SHeading5> H5 = new SeleniumDefaultTag<>(SHeading5.class, StandardTags.H5);
	public static final SeleniumTag<SHeading6> H6 = new SeleniumDefaultTag<>(SHeading6.class, StandardTags.H6);
	public static final SeleniumTag<SHead> HEAD = new SeleniumDefaultTag<>(SHead.class, StandardTags.HEAD);
	public static final SeleniumTag<SHeader> HEADER = new SeleniumDefaultTag<>(SHeader.class, StandardTags.HEADER);
	public static final SeleniumTag<SHtmlRoot> HTML = new SeleniumDefaultTag<>(SHtmlRoot.class, StandardTags.HTML);
	public static final SeleniumTag<SImage> IMG = new SeleniumDefaultTag<>(SImage.class, StandardTags.IMG);
	public static final SeleniumTag<SCheckBox> INPUT_CHECKBOX = new SeleniumDefaultTag<>(SCheckBox.class, StandardTags.INPUT_CHECKBOX);
	public static final SeleniumTag<SColorField> INPUT_COLOR = new SeleniumDefaultTag<>(SColorField.class, StandardTags.INPUT_COLOR);
	public static final SeleniumTag<SDateField> INPUT_DATE = new SeleniumDefaultTag<>(SDateField.class, StandardTags.INPUT_DATE);
	public static final SeleniumTag<SDatetimeField> INPUT_DATETIME = new SeleniumDefaultTag<>(SDatetimeField.class, StandardTags.INPUT_DATETIME);
	public static final SeleniumTag<SEmailField> INPUT_EMAIL = new SeleniumDefaultTag<>(SEmailField.class, StandardTags.INPUT_EMAIL);
	public static final SeleniumTag<SFileUpload> INPUT_FILEUPLOAD = new SeleniumDefaultTag<>(SFileUpload.class, StandardTags.INPUT_FILEUPLOAD);
	public static final SeleniumTag<SNumberField> INPUT_NUMBER = new SeleniumDefaultTag<>(SNumberField.class, StandardTags.INPUT_NUMBER);
	public static final SeleniumTag<SPasswordField> INPUT_PASSWORD = new SeleniumDefaultTag<>(SPasswordField.class, StandardTags.INPUT_PASSWORD);
	public static final SeleniumTag<SRadioButton> INPUT_RADIO = new SeleniumDefaultTag<>(SRadioButton.class, StandardTags.INPUT_RADIO);
	public static final SeleniumTag<SRangeField> INPUT_RANGE = new SeleniumDefaultTag<>(SRangeField.class, StandardTags.INPUT_RANGE);
	public static final SeleniumTag<SSearchField> INPUT_SEARCH = new SeleniumDefaultTag<>(SSearchField.class, StandardTags.INPUT_SEARCH);
	public static final SeleniumTag<STelephoneField> INPUT_TELEPHONE = new SeleniumDefaultTag<>(STelephoneField.class, StandardTags.INPUT_TELEPHONE);
	public static final SeleniumTag<STextField> INPUT_TEXT = new SeleniumDefaultTag<>(STextField.class, StandardTags.INPUT_TEXT);
	public static final SeleniumTag<SUrlField> INPUT_URL = new SeleniumDefaultTag<>(SUrlField.class, StandardTags.INPUT_URL);
	public static final SeleniumTag<SLabel> LABEL = new SeleniumDefaultTag<>(SLabel.class, StandardTags.LABEL);
	public static final SeleniumTag<SListItem> LISTITEM = new SeleniumDefaultTag<>(SListItem.class, StandardTags.LISTITEM);
	public static final SeleniumTag<SMenu> MENU = new SeleniumDefaultTag<>(SMenu.class, StandardTags.MENU);
	public static final SeleniumTag<SMenuItem> MENUITEM = new SeleniumDefaultTag<>(SMenuItem.class, StandardTags.MENUITEM);
	public static final SeleniumTag<SMeter> METER = new SeleniumDefaultTag<>(SMeter.class, StandardTags.METER);
	public static final SeleniumTag<SNav> NAV = new SeleniumDefaultTag<>(SNav.class, StandardTags.NAV);
	public static final SeleniumTag<SOrderedList> OL = new SeleniumDefaultTag<>(SOrderedList.class, StandardTags.OL);
	public static final SeleniumTag<SOptGroup> OPTGROUP = new SeleniumDefaultTag<>(SOptGroup.class, StandardTags.OPTGROUP);
	public static final SeleniumTag<SOption> OPTION = new SeleniumDefaultTag<>(SOption.class, StandardTags.OPTION);
	public static final SeleniumTag<SParagraph> P = new SeleniumDefaultTag<>(SParagraph.class, StandardTags.P);
	public static final SeleniumTag<SProgress> PROGRESS = new SeleniumDefaultTag<>(SProgress.class, StandardTags.PROGRESS);
	public static final SeleniumTag<SSection> SECTION = new SeleniumDefaultTag<>(SSection.class, StandardTags.SECTION);
	public static final SeleniumTag<SSelect> SELECT = new SeleniumDefaultTag<>(SSelect.class, StandardTags.SELECT);
	public static final SeleniumTag<SSource> SOURCE = new SeleniumDefaultTag<>(SSource.class, StandardTags.SOURCE);
	public static final SeleniumTag<SSpan> SPAN = new SeleniumDefaultTag<>(SSpan.class, StandardTags.SPAN);
	public static final SeleniumTag<STable> TABLE = new SeleniumDefaultTag<>(STable.class, StandardTags.TABLE);
	public static final SeleniumTag<SDataCell> TD = new SeleniumDefaultTag<>(SDataCell.class, StandardTags.TD);
	public static final SeleniumTag<STextArea> TEXTAREA = new SeleniumDefaultTag<>(STextArea.class, StandardTags.TEXTAREA);
	public static final SeleniumTag<SHeaderCell> TH = new SeleniumDefaultTag<>(SHeaderCell.class, StandardTags.TH);
	public static final SeleniumTag TITLE = new SeleniumDefaultTag<>(null, StandardTags.TITLE);
	public static final SeleniumTag<SRow> TR = new SeleniumDefaultTag<>(SRow.class, StandardTags.TR);
	public static final SeleniumTag<STrack> TRACK = new SeleniumDefaultTag<>(STrack.class, StandardTags.TRACK);
	public static final SeleniumTag<SList> UL = new SeleniumDefaultTag<>(SList.class, StandardTags.UL);
	public static final SeleniumTag<SVideo> VIDEO = new SeleniumDefaultTag<>(SVideo.class, StandardTags.VIDEO);

	public static final List<SeleniumTag> HEADING_TAGS = Arrays.asList(H1, H2, H3, H4, H5, H6);
	public static final List<SeleniumTag> TAGS = Arrays.asList(
			A, AUDIO, BODY, BUTTON, DATALIST, DIALOG, DIV, FIELDSET, FIGURE, FOOTER, FORM, H1, H2, H3, H4, H5, H6,
			HEAD, HEADER, HTML, IMG, INPUT_CHECKBOX, INPUT_COLOR, INPUT_COLOR, INPUT_DATE, INPUT_DATETIME,
			INPUT_EMAIL, INPUT_FILEUPLOAD, INPUT_NUMBER, INPUT_PASSWORD, INPUT_RADIO, INPUT_RADIO,
			INPUT_RANGE, INPUT_SEARCH, INPUT_TELEPHONE, INPUT_TEXT, INPUT_URL,
			LABEL, LISTITEM, MENU, METER, NAV, OL, OPTGROUP, OPTION, P, PROGRESS, SECTION, SELECT, SOURCE, SPAN,
			TABLE, TD, TEXTAREA, TH, TITLE, TR, TRACK,
			UL, VIDEO
	);

	static {
		for (SeleniumTag tag : SeleniumTags.TAGS) {
			List<SeleniumTag> tags = HTML_TAG_MAP.get(tag.getTagName());
			if (tags == null) {
				tags = new ArrayList<>();
				HTML_TAG_MAP.put(tag.getTagName(), tags);
			}
			tags.add(tag);
		}
	}

}
