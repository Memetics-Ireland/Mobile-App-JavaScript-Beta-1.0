html, body {
	width: 100%;
	height: 100%;
	position: relative;
}
/*@media only screen and (min-device-width: 320px) and (max-device-width: 480px) {
 body{
 width:320px;
 }
 }*/
/* style override for jquery-mobile*/
.ui-body-c, .ui-overlay-c, .ui-btn-up-c, .ui-btn-down-c {
	text-shadow: none;
}

.ui-shadow{
  box-shadow: none !important;
  text-shadow: none !important;
}

.ui-li-thumb {
	float:left !important;
	position:relative !important;
	/*height:80%;*/
}

.module {
	display: block;
	position: relative;
	z-index: 9900;
	/*	border:thin solid red;*/
	/*	width:6.25%;*/
}
table {
	text-align: center;
}
tr {
	vertical-align: middle;
}
td {
	text-align: center;
}
iframe {
	border: 0px;
}
h2 {
	text-shadow: none;
}
#index, #bgimg {
	background-size: 99% 99%;
	max-width: 768px;
	position: relative;
	margin-left: auto;
	margin-right: auto;
}
#content {
	background-size: 100% 100%;
	margin-left: auto;
	margin-right: auto;
	position: relative;
}

#social {
	/*	float: right;*/
	/*	position:relative;*/
	display: block;
	height: 25px;
	bottom: 0px;
	right: 0px;
	width: 100%;
}
#social1 {
	float: right;
	width: 142px;
}
#menutable {
	width: 100%;
	margin-top: 10px;
}
#frame {
	/*	border: 2px solid grey;*/
	border-radius: 10px;
	position: absolute;
	z-index: 1;
	/*	background-color:red;*/
	/*	border: thin solid green;*/
	width: 800px;
	height: 800px;
}
#container {
	position: absolute;
	z-index: 99;
	border: 0px none;
	padding: 0px;
	left: 10px;
	right: 10px;
	top: 10px;
	bottom: 10px;
}
.module_holder {
	width: 5px;
	height: 5px;
	position: absolute;
	/*	background-color: red;*/
}
/*#container img{
 width:50%;
 }*/
div.module {
	position: absolute;
	text-align: center;
	/*	background-color:green;*/
}
div.module_text {
	width: auto;
	min-width: 100%;
	text-align: center;
	overflow: show;
	position: absolute;
	left: 50%;
	/*bottom: 0px; */ /* commented by CDN to remove overlapping of module name at its icon (01-sept-2014) */
	-moz-transform: translateX(-50%);
	-ms-transform: translateX(-50%);
	-webkit-transform: translateX(-50%);
	transform: translateX(-50%);
	text-shadow: 0 0 0 #000000;
	-moz-text-shadow: 0 0 0 #000000;
	-ms-text-shadow: 0 0 0 #000000;
	-o-text-shadow: 0 0 0 #000000;
	-webkit-text-shadow: 0 0 0 #000000;
	bottom: 0;
	position: relative;
}
.module img {

}
.off {
	visibility: hidden;
}
.user_pro {
	width: 100%;
}
.bg-home {
	background-size: 100%;
	text-align: center;
}
.bg {
	background-size: 50% 50%;
	-moz-background-size: 50% 50%;
	text-align: center;
}
.bg-bible {

	background-size: 100%;
	text-align: center;
}
#header-index {
	/*    color:#000000;*/
	/*margin-left: 15px;
	 margin-right: 15px;
	 padding-top: 3px;
	 padding-bottom: 3px;*/
	/*	border-style:solid;*/
	/*    border-width:2px;*/
	font-size: 10px
}
/*
 #content-index{
 background-image:url('../images/bg_light.png');
 margin-top:10px;
 margin-bottom:40px;
 margin-left:15px;
 margin-right:15px;
 padding:5px;
 border-style:solid;
 border-width:2px;
 font-size: 10px;
 }
 #content-index img{
 width:50%;
 }
 */
/* Code by su*/

#loading {
	position: fixed;
	width: 50px;
	height: 50px;
	text-align: center;
	top: 250px;
	left: auto;
	right: auto;
	z-index: 100;
	display: none;
}

.contact_padd {
	padding-left: 13em;
	font-weight: 300;
}

/* Code by su*/

#footer {
	margin-left: auto;
	margin-right: auto;
	padding: 0px;
}
#footer img {
	/*width: 100%; taken out due to some empty images scaling up huge*/
}
a {
	text-decoration: none;
	/*color: #000000;*/
	/*font-size: 12px;*/
}

#hometitle {
	font-size: 20px;
	font-weight: bold;
	color: #006;
}
#homesubtitle {
	font-size: 12px;
	color: #000;
	font-weight: normal;
	margin: 5px;
}

/*added by DH*/
#homeimage {
	max-height: 70px;
	max-width: 100%;
	/*this is MAX-Width only, instead of 'width'
	 * because we don't want to stretch small images
	 * (ie. word titles) to fit.
	 * We just don't want them to be any bigger than 100%*/
	/*width: 100%;*/

}

/*----Ad by ni ----*/
/*modified by DH
 .homesubhead {
 font-size: 14px;
 color: #000066;
 font-weight: bold;
 margin: 5px;
 }

 #homsubhead_txt
 {
 font-size: 14px;
 color: #000066;
 font-weight: bold;
 }
 */
/*-----------*/

.ui-li, .dataList {
	/*opacity: 0.8;*/
	background-color: transparent !important;
	background-image: none !important;
	text-shadow: none !important;
	box-shadow:none !important;
	-webkit-box-shadow:none !important;
}
/* Commented by CDN */
/*.dataList li {
 margin-bottom: 7px !important;
 border-radius: 7px !important;
 -webkit-box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
 -moz-box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
 box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
 } */
/* added by CDN on 11- july -2014 */
.cardlook {

	margin-bottom: 7px !important;
	border-radius: 7px !important;
	-webkit-box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
	-moz-box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
	box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
}

.dataList .ui-btn-up-c, .ui-btn-hover-c {
	font-weight: normal !important;
}

img.listImage {
	/*	width: 6%;*/
	/*	min-width:50px;*/
	margin: 5px;
	vertical-align: middle;
}

div.circleImage {
	width:30%;
	border-radius: 100px;
	float: left;
	margin: 0px 10px 0px 0px;
	background-color: #555;
	border: 1px solid #777;
	-webkit-box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
	-moz-box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
	box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
	overflow: hidden;

min-height: 103px !important;
max-height: 105px !important;
max-width: 100px !important;}
	div.circleImage img {
    min-height: 105px !important;
}

.dataList div.listItemFooter {
	clear: both;
	font-size: 0.8em;
	padding-top: 5px;
	margin: 0px 15px 5px 15px;
}
.dataList div.listItemFooter img {
	vertical-align: middle;
}

.rowLink {
	line-height: auto;
}

.rowTitle {
	font-size: 1.5em !important;
	font-weight: normal !important;
	color: #006;
	/* padding-left:0.8%;  	*/
	margin: 0.2em !important;
}

.rowDescription {
	font-size: 0.9em;
	font-style: normal;
	font-weight: normal !important;
	color: #000;
	white-space: normal !important;
	margin: 0px !important;
}
.rowDate {
	font-size: small;
	font-style: italic;
	font-weight: normal;
}

.rowSocial {
	bottom: 0;
	display: block;
	float: right;
	position: relative;
	right: -20px;
}
.rowSocial img {
	width: 80px;
	margin-bottom: 5px;
}

.imagegallery {
	margin: 0;
	padding: 0
}

.ui-li {
	overflow-y: auto;
}

.ui-li-has-thumb .ui-btn-inner a.ui-link-inherit, .ui-li-static.ui-li-has-thumb {
	min-height: 60px;
	/*	padding-left: 50%;*/
}
/*.ui-li .ui-btn-inner a.ui-link-inherit, .ui-li-static.ui-li {
 padding: 0.7% 7% 0.7% 14%;
 display: block;
 }*/
/* Custome css by ni */
.view_map_button {
	background-image: url(../images/view_btn.png);
	background-repeat: no-repeat;
	height: 25px;
	width: 76px;
	border: 0px solid;
}

.email_button {
	background-image: url(../images/email.png);
	width: 76px;
	height: 25px;
	background-repeat: no-repeat;
	border: 0px;
}

.coll_button {
	background-image: url(../images/call_btn.png);
	width: 76px;
	height: 26px;
	background-repeat: no-repeat;
	border: 0px;
}
#loader {

	-moz-opacity: 0.8;
	opacity: .80;
	filter: alpha(opacity=80);
	position: absolute;
	padding: 30% 30% 15% 33%;
	width: 25%;
	z-index: 1002;
	overflow: auto;
	background-repeat: no-repeat
}

.btn_wp {
	float: left;
	width: 128px;
	padding: 0 5px 0 0;
}

.bg_sel {
	width: 256px;
	height: 36px;
	color: #fff;
	font: 12px/21px arial, sans-serif;
	padding: 0 0 0 10px;
	line-height: 31px;
	background: url(../../images/browse_bg.jpg) no-repeat;
	overflow: hidden;
	color: #000000;
	position: relative;
}

.sty {
	position: absolute;
	left: 0px;
	width: 258px !important;
	height: 31px;
	cursor: pointer;
	margin: 0 0 0 0px;
	display: inline;
}

.opc {
	opacity: 0;alpha.filter:=(opacity="0");
}

#abc {
	width: 150px;
	float: left;
	overflow: hidden;
	line-height: 36px;
}

.ui-loader {
	display: none !important;
}

/*form status bars*/
.progress {
	position: relative;
	/*width: 400px;*/
	border: 1px solid #ddd;
	padding: 1px;
	border-radius: 3px;
}
.bar {
	background-color: #B4F5B4;
	width: 0%;
	height: 20px;
	border-radius: 3px;
}

/* secret_word.php*/
#incorrectlabel {
	color: red;
}

/*bible, torah, quran*/
#verse_container {
	text-align: left;
}
p.verse {
	margin: 5px 5px, 10px, 5px;
	font-size: 1.0em;
}
img.buyButton {
	width: 15%;
	min-width: 80px;
}
/* added by CDN to remove scroll from click-to-callme on date-12-june-2013 */
.scroll_rem {
	height: auto;
}
.scroll_rem .ui-li {
	overflow-y: inherit !important;
}

/*remove text shadows*/
.ui-btn.ui-li {
	text-shadow: none !important;
}
ul[data-role="listview"] .ui-btn-inner *, ul[data-role="listview"] .ui-btn-inner {
	white-space: normal !important;
	overflow: hidden;
}

/* ------------------- Added by CDN on 14th july while upgrading version of jquery mobile ----------------- */

.ui-header, .ui-footer {
	border-left-width: 0;
	border-right-width: 0;
	zoom: 1;
}
.ui-page-theme-a .ui-bar-inherit {
	border: 1px solid #333;
	background: #111;
	color: #fff;
	font-weight: bold;
	text-shadow: 0 -1px 1px #000;
	background-image: -webkit-gradient(linear,left top,left bottom,from( #3c3c3c ),to( #111 ));
	background-image: -webkit-linear-gradient( #3c3c3c,#111 );
	background-image: -moz-linear-gradient( #3c3c3c,#111 );
	background-image: -ms-linear-gradient( #3c3c3c,#111 );
	background-image: -o-linear-gradient( #3c3c3c,#111 );
	background-image: linear-gradient( #3c3c3c,#111 );
}
.ui-btn.ui-corner-all {
	-moz-border-radius: 1em;
	-webkit-border-radius: 1em;
	border-radius: 1em;
}
.ui-btn .ui-shadow {
	-moz-box-shadow: 0 1px 0 rgba(255,255,255,.3);
	-webkit-box-shadow: 0 1px 0 rgba(255,255,255,.3);
	box-shadow: 0 1px 0 rgba(255,255,255,.3);
}
.ui-icon-home.ui-btn, .ui-btn {
	border: 1px solid #111;
	background: #333;
	font-weight: bold;
	color: #fff;
	text-shadow: 0 1px 1px #111;
	background-image: -webkit-gradient(linear,left top,left bottom,from( #444 ),to( #2d2d2d ));
	background-image: -webkit-linear-gradient( #444,#2d2d2d );
	background-image: -moz-linear-gradient( #444,#2d2d2d );
	background-image: -ms-linear-gradient( #444,#2d2d2d );
	background-image: -o-linear-gradient( #444,#2d2d2d );
	background-image: linear-gradient( #444,#2d2d2d );
}
.ui-btn.ui-icon-home {
	border: medium none;
	box-shadow: 0 1px 0 rgba(255, 255, 255, 0.3) inset;
	color: #FFFFFF !important;
	font-size: 12.5px;
	text-shadow: none;
}
/*ul.dataList li, .dataList li a.ui-btn.ui-icon-carat-r {
 background-color: rgba(191, 104, 214, 0.61) !important;
 border-color: #28EC2E !important;
 color: #1F1FE7 !important;
 text-shadow: none;
 } */

.ui-btn {
	color: #FFFFFF !important;
	text-shadow: inherit !important;
	border-top: 1px solid #fff !important;
	border-color: rgba(255,255,255,.3) !important;
	border: 1px solid #111 !important;
}

a.rowLink {
	font-weight: normal !important;
	white-space: normal;
}
.fanmappr_button div.ui-btn {
	display: block !important;
}

tr.preference_wrapper td .ui-select .ui-btn {
	background-image: -webkit-gradient(linear,left top,left bottom,from( #5f9cc5 ),to( #396b9e )) !important;
	background-image: -webkit-linear-gradient( #5f9cc5,#396b9e ) !important;
	background-image: -moz-linear-gradient( #5f9cc5,#396b9e ) !important;
	background-image: -ms-linear-gradient( #5f9cc5,#396b9e ) !important;
	background-image: -o-linear-gradient( #5f9cc5,#396b9e ) !important;
	background-image: linear-gradient( #5f9cc5,#396b9e ) !important;
	border: 1px solid #044062;
	color: #fff;
	font-weight: bold;
	text-shadow: 0 1px 1px #194b7e;
}

.form_wrap {
	background-image: -webkit-gradient(linear,left top,left bottom,from( #ddd ),to( #ccc )) !important;
	background-image: -webkit-linear-gradient( #ddd,#ccc ) !important;
	background-image: -moz-linear-gradient( #ddd,#ccc ) !important;
	background-image: -ms-linear-gradient( #ddd,#ccc ) !important;
	background-image: -o-linear-gradient( #ddd,#ccc ) !important;
	background-image: linear-gradient( #ddd,#ccc ) !important;
}
.form_wrapLight {
	background-image: -webkit-gradient(linear,left top,left bottom,from( #f9f9f9 ),to( #eeeeee )) !important;
	background-image: -webkit-linear-gradient( #f9f9f9,#eeeeee ) !important;
	background-image: -moz-linear-gradient( #f9f9f9,#eeeeee ) !important;
	background-image: -ms-linear-gradient( #f9f9f9,#eeeeee ) !important;
	background-image: -o-linear-gradient( #f9f9f9,#eeeeee ) !important;
	background-image: linear-gradient( #f9f9f9,#eeeeee ) !important;
}

.blueButton .ui-btn {
	background-image: -webkit-gradient(linear,left top,left bottom,from( #5f9cc5 ),to( #396b9e )) !important;
	background-image: -webkit-linear-gradient( #5f9cc5,#396b9e ) !important;
	background-image: -moz-linear-gradient( #5f9cc5,#396b9e ) !important;
	background-image: -ms-linear-gradient( #5f9cc5,#396b9e ) !important;
	background-image: -o-linear-gradient( #5f9cc5,#396b9e ) !important;
	background-image: linear-gradient( #5f9cc5,#396b9e ) !important;
	border: 1px solid #044062;
	color: #fff;
	font-weight: bold;
	text-shadow: 0 1px 1px #194b7e;
}

.BrowseButton .ui-input-text {
	display: none;
}

.clear {
	width: 100%;
	clear: both;
}

.WhitwButton .ui-btn {
	background-image: -webkit-gradient(linear,left top,left bottom,from( #fff ),to( #f1f1f1 )) !important;
	background-image: -webkit-linear-gradient( #fff,#f1f1f1 ) !important;
	background-image: -moz-linear-gradient( #fff,#f1f1f1 ) !important;
	background-image: -ms-linear-gradient( #fff,#f1f1f1 ) !important;
	background-image: -o-linear-gradient( #fff,#f1f1f1 ) !important;
	background-image: linear-gradient( #fff,#f1f1f1 ) !important;
	border: 1px solid #ccc !important;
	color: #222 !important;
	font-weight: bold;
	text-shadow: 0 1px 0 #fff;
}

.preference_wrapperWhite .ui-btn {
	background-image: -webkit-gradient(linear,left top,left bottom,from( #fff ),to( #f1f1f1 )) !important;
	background-image: -webkit-linear-gradient( #fff,#f1f1f1 ) !important;
	background-image: -moz-linear-gradient( #fff,#f1f1f1 ) !important;
	background-image: -ms-linear-gradient( #fff,#f1f1f1 ) !important;
	background-image: -o-linear-gradient( #fff,#f1f1f1 ) !important;
	background-image: linear-gradient( #fff,#f1f1f1 ) !important;
	border: 1px solid #ccc !important;
	color: #222 !important;
	font-weight: bold;
	text-shadow: 0 1px 0 #fff;
}

.classifiedList li a.ui-btn {
	background-color: transparent !important;
	background-image: none !important;
}

.documentsList li a {
	text-indent: 72px;
}
.indentedList li {
	padding: 0 0 0 72px !important;
}

.menuList {
	margin: 8px 0 0;
}

.menuList li.ui-btn {
	border-top: 1px solid #CCCCCC !important;
	border-right: 1px solid #CCCCCC !important;
	border-left: 1px solid #CCCCCC !important;
	border-bottom: 0px solid #CCCCCC !important;
	font-size: 0.7em;
	padding: 0 0 0 13px;
	text-align: left;
}
/*.menuList .ui-btn-icon-left:after, .ui-btn-icon-right:after, .ui-btn-icon-top:after, .ui-btn-icon-bottom:after, .ui-btn-icon-notext:after{
 background-color: transparent !important;
 } */
.menuList li:first-child.ui-btn {
	border-top-left-radius: 0.6em;
	border-top-right-radius: 0.6em;
}
.menuList li:last-child.ui-btn {
	border-bottom-left-radius: 0.6em;
	border-bottom-right-radius: 0.6em;
}

.score_button li a.ui-btn {
	border-radius: 1em !important;
	text-align: center;
}

ul.callList li.ui-first-child a.ui-btn {
	background: inherit !important;
}

div.SquareImage {
	background-size: 80px 80px;
	background-repeat: no-repeat;
	height: 80px;
	width: 80px;
	border-radius: 0px;
	float: left;
	margin: 0px 10px 0px 0px;
	background-color: #555;
	border: 1px solid #777;
	-webkit-box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
	-moz-box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
	box-shadow: 2px 2px 3px 0px rgba(50, 50, 50, 0.75);
}
.module a {
	display: inline-block;
}

/* CSS for barcode module */

.barcode_content {
	display: table;
	height: 300px;
	width: 100%;
}
.barcode_content > .barcode_image {
	display: table-cell;
	text-align: center;
	vertical-align: middle;
}

/* Added by CDN for direction Module on 28th october2014 */
.direction_address {
	height: 47px;
	text-align: center;
	text-decoration: none;
	line-height: 47px;
	position: absolute;
	bottom: 51px;
	width: 100%;
}

/* Added by CDN on 4th Nov 2014 */
.circleImage img {
	border-top-left-radius: initial !important;
}
div.circleImage img:last-child {
	border-bottom-left-radius: initial !important;
}

/* added by CDN on date - 01-sept-2014 */
.result_button {
	width: 93%;
}

.openclose {
	position: absolute;
	top: 30%;
	text-align: center;
	width: 100%;
}
/** Added by CDN on date 11-may-2015  for  adjusting circle image*/
@media (max-width: 990px) {
	div.circleImage{
		min-height: 103px !important;
		max-height: 105px !important;
		max-width: 100px !important;
	}
	div.circleImage img {
		min-height: 105px !important;
	}
}

@media (min-width: 480px) and (max-width: 630px) {
	.result_button {
		width: 88%;
	}
}
@media (min-width: 640px) and (max-width: 767px) {
	.result_button {
		width: 85%;
	}
}

@media  (max-width: 480px) {
	div.circleImage{
		min-height:60px!important;
		max-height:60px!important;
		max-width:60px !important;
	}
	div.circleImage img{
		min-height:60px!important;
	}
}

@media (min-width: 320px) and (max-width: 360px) {
	.result_button {
		width: 88%;
	}
	div.circleImage{
		min-height:40px!important;
		max-height:40px!important;
		max-width:40px !important;
	}
	div.circleImage img{
		min-height:40px!important;
	}
}



