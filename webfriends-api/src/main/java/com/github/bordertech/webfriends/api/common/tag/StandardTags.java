package com.github.bordertech.webfriends.api.common.tag;

import com.github.bordertech.webfriends.api.element.document.HHtmlRoot;
import com.github.bordertech.webfriends.api.element.embedded.HAudio;
import com.github.bordertech.webfriends.api.element.embedded.HImage;
import com.github.bordertech.webfriends.api.element.embedded.HImageMap;
import com.github.bordertech.webfriends.api.element.embedded.HSource;
import com.github.bordertech.webfriends.api.element.embedded.HTrack;
import com.github.bordertech.webfriends.api.element.embedded.HVideo;
import com.github.bordertech.webfriends.api.element.form.HButton;
import com.github.bordertech.webfriends.api.element.form.HForm;
import com.github.bordertech.webfriends.api.element.form.HLabel;
import com.github.bordertech.webfriends.api.element.form.input.HCheckBox;
import com.github.bordertech.webfriends.api.element.form.input.HColorField;
import com.github.bordertech.webfriends.api.element.form.input.HDateField;
import com.github.bordertech.webfriends.api.element.form.input.HDatetimeField;
import com.github.bordertech.webfriends.api.element.form.input.HEmailField;
import com.github.bordertech.webfriends.api.element.form.input.HFileUpload;
import com.github.bordertech.webfriends.api.element.form.input.HNumberField;
import com.github.bordertech.webfriends.api.element.form.input.HPasswordField;
import com.github.bordertech.webfriends.api.element.form.input.HRadioButton;
import com.github.bordertech.webfriends.api.element.form.input.HRangeField;
import com.github.bordertech.webfriends.api.element.form.input.HSearchField;
import com.github.bordertech.webfriends.api.element.form.input.HTelephoneField;
import com.github.bordertech.webfriends.api.element.form.input.HTextField;
import com.github.bordertech.webfriends.api.element.form.input.HUrlField;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;
import com.github.bordertech.webfriends.api.element.form.other.HFieldSet;
import com.github.bordertech.webfriends.api.element.form.other.HMeter;
import com.github.bordertech.webfriends.api.element.form.other.HProgress;
import com.github.bordertech.webfriends.api.element.form.select.HDatalist;
import com.github.bordertech.webfriends.api.element.form.select.HOptGroup;
import com.github.bordertech.webfriends.api.element.form.select.HOption;
import com.github.bordertech.webfriends.api.element.form.select.HSelect;
import com.github.bordertech.webfriends.api.element.form.text.HTextArea;
import com.github.bordertech.webfriends.api.element.grouping.HDiv;
import com.github.bordertech.webfriends.api.element.grouping.HFigure;
import com.github.bordertech.webfriends.api.element.grouping.HList;
import com.github.bordertech.webfriends.api.element.grouping.HListItem;
import com.github.bordertech.webfriends.api.element.grouping.HMenu;
import com.github.bordertech.webfriends.api.element.grouping.HMenuItem;
import com.github.bordertech.webfriends.api.element.grouping.HOrderedList;
import com.github.bordertech.webfriends.api.element.grouping.HParagraph;
import com.github.bordertech.webfriends.api.element.interactive.HDialog;
import com.github.bordertech.webfriends.api.element.metadata.HHead;
import com.github.bordertech.webfriends.api.element.sections.HBody;
import com.github.bordertech.webfriends.api.element.sections.HFooter;
import com.github.bordertech.webfriends.api.element.sections.HHeader;
import com.github.bordertech.webfriends.api.element.sections.HHeading1;
import com.github.bordertech.webfriends.api.element.sections.HHeading2;
import com.github.bordertech.webfriends.api.element.sections.HHeading3;
import com.github.bordertech.webfriends.api.element.sections.HHeading4;
import com.github.bordertech.webfriends.api.element.sections.HHeading5;
import com.github.bordertech.webfriends.api.element.sections.HHeading6;
import com.github.bordertech.webfriends.api.element.sections.HNav;
import com.github.bordertech.webfriends.api.element.sections.HSection;
import com.github.bordertech.webfriends.api.element.table.HDataCell;
import com.github.bordertech.webfriends.api.element.table.HHeaderCell;
import com.github.bordertech.webfriends.api.element.table.HRow;
import com.github.bordertech.webfriends.api.element.table.HTable;
import com.github.bordertech.webfriends.api.element.textlevel.HLinkAnchor;
import com.github.bordertech.webfriends.api.element.textlevel.HSpan;
import java.util.Arrays;
import java.util.List;

/**
 * Standard HTML tag types.
 */
public class StandardTags {

	public static final ElementTag<HLinkAnchor> A = new DefaultTag<>(HLinkAnchor.class, "a");
	public static final ElementTag<HAudio> AUDIO = new DefaultTag<>(HAudio.class, "audio");
	public static final ElementTag<HBody> BODY = new DefaultTag<>(HBody.class, "body");
	public static final ElementTag<HButton> BUTTON = new DefaultTag<>(HButton.class, "button");
	public static final ElementTag<HDatalist> DATALIST = new DefaultTag<>(HDatalist.class, "datalist");
	public static final ElementTag<HDialog> DIALOG = new DefaultTag<>(HDialog.class, "dialog");
	public static final ElementTag<HDiv> DIV = new DefaultTag<>(HDiv.class, "div");
	public static final ElementTag<HFieldSet> FIELDSET = new DefaultTag<>(HFieldSet.class, "fieldset");
	public static final ElementTag<HFigure> FIGURE = new DefaultTag<>(HFigure.class, "figure");
	public static final ElementTag<HFooter> FOOTER = new DefaultTag<>(HFooter.class, "footer");
	public static final ElementTag<HForm> FORM = new DefaultTag<>(HForm.class, "form");
	public static final ElementTag<HHeading1> H1 = new DefaultTag<>(HHeading1.class, "h1");
	public static final ElementTag<HHeading2> H2 = new DefaultTag<>(HHeading2.class, "h2");
	public static final ElementTag<HHeading3> H3 = new DefaultTag<>(HHeading3.class, "h3");
	public static final ElementTag<HHeading4> H4 = new DefaultTag<>(HHeading4.class, "h4");
	public static final ElementTag<HHeading5> H5 = new DefaultTag<>(HHeading5.class, "h5");
	public static final ElementTag<HHeading6> H6 = new DefaultTag<>(HHeading6.class, "h6");
	public static final ElementTag<HHead> HEAD = new DefaultTag<>(HHead.class, "head");
	public static final ElementTag<HHeader> HEADER = new DefaultTag<>(HHeader.class, "header");
	public static final ElementTag<HHtmlRoot> HTML = new DefaultTag<>(HHtmlRoot.class, "html");
	public static final ElementTag<HImage> IMG = new DefaultTag<>(HImage.class, "img");
	public static final ElementTag<HImageMap> IMG_MAP = new DefaultTag<>(HImageMap.class, "img", Qualifier.create("usemap", ""));
	public static final ElementTag<HCheckBox> INPUT_CHECKBOX = new DefaultTag<>(HCheckBox.class, InputElement.InputType.CHECKBOX);
	public static final ElementTag<HColorField> INPUT_COLOR = new DefaultTag<>(HColorField.class, InputElement.InputType.COLOR);
	public static final ElementTag<HDateField> INPUT_DATE = new DefaultTag<>(HDateField.class, InputElement.InputType.DATE);
	public static final ElementTag<HDatetimeField> INPUT_DATETIME = new DefaultTag<>(HDatetimeField.class, InputElement.InputType.DATETIME);
	public static final ElementTag<HEmailField> INPUT_EMAIL = new DefaultTag<>(HEmailField.class, InputElement.InputType.EMAIL);
	public static final ElementTag<HFileUpload> INPUT_FILEUPLOAD = new DefaultTag<>(HFileUpload.class, InputElement.InputType.FILEUPLOAD);
	public static final ElementTag<HNumberField> INPUT_NUMBER = new DefaultTag<>(HNumberField.class, InputElement.InputType.NUMBER);
	public static final ElementTag<HPasswordField> INPUT_PASSWORD = new DefaultTag<>(HPasswordField.class, InputElement.InputType.PASSWORD);
	public static final ElementTag<HRadioButton> INPUT_RADIO = new DefaultTag<>(HRadioButton.class, InputElement.InputType.RADIO);
	public static final ElementTag<HRangeField> INPUT_RANGE = new DefaultTag<>(HRangeField.class, InputElement.InputType.RANGE);
	public static final ElementTag<HSearchField> INPUT_SEARCH = new DefaultTag<>(HSearchField.class, InputElement.InputType.SEARCH);
	public static final ElementTag<HTelephoneField> INPUT_TELEPHONE = new DefaultTag<>(HTelephoneField.class, InputElement.InputType.TELEPHONE);
	public static final ElementTag<HTextField> INPUT_TEXT = new DefaultTag<>(HTextField.class, InputElement.InputType.TEXT);
	public static final ElementTag<HUrlField> INPUT_URL = new DefaultTag<>(HUrlField.class, InputElement.InputType.URL);
	public static final ElementTag<HLabel> LABEL = new DefaultTag<>(HLabel.class, "label");
	public static final ElementTag<HListItem> LISTITEM = new DefaultTag<>(HListItem.class, "listitem");
	public static final ElementTag<HMenu> MENU = new DefaultTag<>(HMenu.class, "menu");
	// TODO Need to fix the qualifier for menu item to differentiate from listitem
	public static final ElementTag<HMenuItem> MENUITEM = new DefaultTag<>(HMenuItem.class, "li", Qualifier.create("ismenu"));
	public static final ElementTag<HMeter> METER = new DefaultTag<>(HMeter.class, "meter");
	public static final ElementTag<HNav> NAV = new DefaultTag<>(HNav.class, "nav");
	public static final ElementTag<HOrderedList> OL = new DefaultTag<>(HOrderedList.class, "ol");
	public static final ElementTag<HOptGroup> OPTGROUP = new DefaultTag<>(HOptGroup.class, "optgroup");
	public static final ElementTag<HOption> OPTION = new DefaultTag<>(HOption.class, "option");
	public static final ElementTag<HParagraph> P = new DefaultTag<>(HParagraph.class, "p");
	public static final ElementTag<HProgress> PROGRESS = new DefaultTag<>(HProgress.class, "progress");
	public static final ElementTag<HSection> SECTION = new DefaultTag<>(HSection.class, "section");
	public static final ElementTag<HSelect> SELECT = new DefaultTag<>(HSelect.class, "select");
	public static final ElementTag<HSource> SOURCE = new DefaultTag<>(HSource.class, "source");
	public static final ElementTag<HSpan> SPAN = new DefaultTag<>(HSpan.class, "span");
	public static final ElementTag<HTable> TABLE = new DefaultTag<>(HTable.class, "table");
	public static final ElementTag<HDataCell> TD = new DefaultTag<>(HDataCell.class, "td");
	public static final ElementTag<HTextArea> TEXTAREA = new DefaultTag<>(HTextArea.class, "textarea");
	public static final ElementTag<HHeaderCell> TH = new DefaultTag<>(HHeaderCell.class, "th");
	public static final ElementTag TITLE = new DefaultTag<>(null, "title");
	public static final ElementTag<HRow> TR = new DefaultTag<>(HRow.class, "tr");
	public static final ElementTag<HTrack> TRACK = new DefaultTag<>(HTrack.class, "track");
	public static final ElementTag<HList> UL = new DefaultTag<>(HList.class, "ul");
	public static final ElementTag<HVideo> VIDEO = new DefaultTag<>(HVideo.class, "video");

	public static final List<ElementTag> HEADING_TAGS = Arrays.asList(H1, H2, H3, H4, H5, H6);
	public static final List<ElementTag> TAGS = Arrays.asList(
			A, AUDIO, BODY, BUTTON, DATALIST, DIALOG, DIV, FIELDSET, FIGURE, FOOTER, FORM, H1, H2, H3, H4, H5, H6,
			HEAD, HEADER, HTML, IMG, INPUT_CHECKBOX, INPUT_COLOR, INPUT_COLOR, INPUT_DATE, INPUT_DATETIME,
			INPUT_EMAIL, INPUT_FILEUPLOAD, INPUT_NUMBER, INPUT_PASSWORD, INPUT_RADIO, INPUT_RADIO,
			INPUT_RANGE, INPUT_SEARCH, INPUT_TELEPHONE, INPUT_TEXT, INPUT_URL,
			LABEL, LISTITEM, MENU, METER, NAV, OL, OPTGROUP, OPTION, P, PROGRESS, SECTION, SELECT, SOURCE, SPAN,
			TABLE, TD, TEXTAREA, TH, TITLE, TR, TRACK,
			UL, VIDEO
	);

}
