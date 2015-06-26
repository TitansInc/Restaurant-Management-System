var uatRandNo=Math.floor(Math.random()*100000);var varPassOapp="";var varPublisherId="1403";var varTagId="6357";var varSectionIDAPN="450162";var varChannels="tedu,tscl,ttch";var varChannelIDs="4,16,18";var comscorePlacementId="6357";var comscoreCategoryId="10900";var varSiteName="SeminarProjects";var varSectionName="SeminarProjects";var varAggPubId="1403_6357";if(typeof varDivRand=="undefined"||varDivRand==1){var varDivRand=Math.floor(Math.random()*11000);document.write('<div id="uat'+varDivRand+'"></div>');var divID=document.getElementById("uat"+varDivRand);var adStartHeight=findPosition(divID);varQueryAdSize=parseQuery(queryString,"ad_size");varQueryReferrer=parseQuery(queryString,"referrer");varQueryDisp=parseQuery(queryString,"disp");var adWidth=getWidth(varQueryAdSize);var adHeight=getHeight(varQueryAdSize);if(varQueryAdSize.indexOf(",")>-1){var arrAdSize=varQueryAdSize.split(",");adWidth=getWidth(arrAdSize[0]);adHeight=getHeight(arrAdSize[0])}var windowHeight=WindowGetHeight();var adEndHeight=parseInt(adStartHeight)+parseInt(adHeight/2);if(adEndHeight>windowHeight){apnAboveFold="below";tagPosition="BTF"}else{apnAboveFold="above";tagPosition="ATF"}varDivRand=1}var varRBArray=new Array();if(!window.teRBID){var varRandom=Math.floor(Math.random()*varRBArray.length);var teRBID=varRBArray[varRandom]}var scripts=document.getElementsByTagName("script");var icount=1;for(icount=1;icount<scripts.length;icount++){var tempScript=scripts[scripts.length-icount];var uatStart=tempScript.src.indexOf("/uat_");if(uatStart>0){break}}var myScript=scripts[scripts.length-icount];var queryString=myScript.src.replace(/^[^\?]+\??/,"");var tmIsSecure=(myScript.src.substring(0,6)=="https:");var uatStart=myScript.src.indexOf("uat_");var uatEnd=myScript.src.indexOf(".js?");var uatID=myScript.src.substring(uatStart+4,uatEnd);var findSlash=window.location.pathname.indexOf("/");if(findSlash==0){var passPageTracker="/"+uatID+"/"+window.location.host+""+window.location.pathname}else{var passPageTracker="/"+uatID+"/"+window.location.host+"/"+window.location.pathname}var callForAds=1;var callForPixel=1;var varAdStop1=parseQuery(queryString,"!c");if(varAdStop1!=false){if(varAdStop1.toLowerCase()=="house"){callForAds=0}}varPTVs="";var varccp=getURLParam("ccp");if(varccp!="323WERKJKLDSJFlk23ididfj42342"){varPTVs=varPTVs+"&ccp="+varccp}var vartmtest=getURLParam("tmtest");if(vartmtest!="323WERKJKLDSJFlk23ididfj42342"){varPTVs=varPTVs+"&tmtest="+vartmtest}var varq=getURLParam("q");if(varq!="323WERKJKLDSJFlk23ididfj42342"){varPTVs=varPTVs+"&q="+varq}var varccpvalue=getURLParam("ccpvalue");if(varccpvalue!="323WERKJKLDSJFlk23ididfj42342"){varPTVs=varPTVs+"&ccpvalue="+varccpvalue}var varroadblock=getURLParam("roadblock");if(varroadblock!="323WERKJKLDSJFlk23ididfj42342"){varPTVs=varPTVs+"&roadblock="+varroadblock}_qoptions={qacct:"p-6cp0NSw2i2sSA",labels:"Education,Social Networking,Technology"};var sectionTargeting="&prm=0&nwk=0&efo=0&dir=1&rem=1&pas=0";var cookieCount=getCookie("TMEDIA");var getCookieIsp=getCookie("TMEDIAISP");if(cookieCount!=-1){var cookieCountry=cookieCount.substring(5,cookieCount.indexOf("/"));queryString=queryString+"&dmsc="+cookieCountry+"&dmsi="+escape(getCookieIsp)}if(window.varDocRefType=="adnetwork"){queryString=queryString+"&pub_url=www.seminarprojects.com&referrer=www.seminarprojects.com";varReferrer="www.seminarprojects.com"}if(window.varDocRefType!="adnetwork"){varQueryReferrer=parseQuery(queryString,"referrer");varReferrer=varQueryReferrer;varDocReferrer=getDocReferrer(varQueryReferrer);if(varDocReferrer!=undefined&&varDocReferrer!=""){var ref=parseQuery(varDocReferrer,"referrer");if(ref!=null&&ref!=""){queryString=queryString+"&"+varDocReferrer;queryString=queryString+"&pub_url="+ref;varReferrer=ref}}}varUrlParam=-1;if(!window.teRBID){if(varPassOapp==""){varUrlParam="pfm=1&tedu=ch&tscl=ch&ttch=ch&rtg=ga&brw="+browserversion+"&os="+osname+sectionTargeting+"&position="+apnAboveFold+"&uatRandNo="+uatRandNo+"&ad_type=ad&section=1213729"+""+varPTVs+"&"+queryString}else{varUrlParam="pfm=1&tedu=ch&tscl=ch&ttch=ch&rtg=ga&brw="+browserversion+"&os="+osname+sectionTargeting+"&position="+apnAboveFold+"&uatRandNo="+uatRandNo+"&ad_type=ad&section=1213729"+""+varPTVs+""+varPassOapp+"&"+queryString}}else{if(varPassOapp==""){varUrlParam="pfm=1&tedu=ch&tscl=ch&ttch=ch&rtg=ga&brw="+browserversion+"&os="+osname+sectionTargeting+"&position="+apnAboveFold+"&uatRandNo="+uatRandNo+"&ad_type=ad&section=1213729"+""+varPTVs+"&rbCode="+teRBID+"&"+queryString}else{varUrlParam="pfm=1&tedu=ch&tscl=ch&ttch=ch&rtg=ga&brw="+browserversion+"&os="+osname+sectionTargeting+"&position="+apnAboveFold+"&uatRandNo="+uatRandNo+"&ad_type=ad&section=1213729"+""+varPTVs+"&rbCode="+teRBID+""+varPassOapp+"&"+queryString}}if(callForAds!=undefined&&callForAds==1){var varPassRand=Math.floor(Math.random()*11000000000);varGRM=0;var tsrcURL=(tmIsSecure?"https://secure.adnxs.com":"http://tmx.technoratimedia.com");if(varQueryAdSize.indexOf(",")>-1){var adSize1=varQueryAdSize.substring(0,varQueryAdSize.indexOf(","));var adSize2=varQueryAdSize.substring(varQueryAdSize.indexOf(",")+1);tsrcURL=tsrcURL+"/ttj?id="+varSectionIDAPN+"&promo_alignment=none&size="+adSize1+"&promo_sizes="+adSize2}else{tsrcURL=tsrcURL+"/ttj?id="+varSectionIDAPN+"&size="+varQueryAdSize}tsrcURL+="&pt1="+"767484444804963";tsrcURL+="&pt2=6357";if(varGRM==0&&varUrlParam!=-1){tsrcURL=tsrcURL+"&"+varUrlParam}tsrcURL=tsrcURL+"&cb="+varPassRand;if(window.varTAdsQv){tsrcURL=tsrcURL+"&"+window.varTAdsQv}if(window.varTAdsQT&&window.varTAdsQT.length>0){tsrcURL=tsrcURL+"&"+window.varTAdsQT}document.write('<script type="text/javascript" src="'+tsrcURL+'"></scr'+"ipt>")}varQueryAdSize=varQueryAdSize+"_prm"+sectionTargeting;function TMX_DefaultOrPSA(a){if("PSA"=="PASSBACK"){

document.write('<script type="text/javascript" src="'+(tmIsSecure?"https":"http")+"://uat-net.technoratimedia.com/pixel?rid=767484444804963&id=4&bid="+a+'"></scr'+"ipt>")}else{
document.write('<scr' + 'ipt type="text/javascript" src="' + (tmIsSecure ? 'https://uat-net' : 'http://ad-cdn') + '.technoratimedia.com/psa/psa.js' +'"></scr' + 'ipt>');
document.write('<script type="text/javascript" src="'+(tmIsSecure?"https":"http")+"://uat-net.technoratimedia.com/pixel?rid=767484444804963&id=3&bid="+a+'"></scr'+"ipt>")}}function displayAds(){TMX_Default()}function TMX_Default(){TMX_DefaultOrPSA("APN")};if (typeof callForPixel!='undefined' && callForPixel==1) {if(window.varPixel15==undefined){var _comscore=_comscore || [];
_comscore.push({ c1: "8", c2: "6036211", c3: comscoreCategoryId, c4: comscorePlacementId});
(function(){
    var _comscoreScript=document.createElement("script");
    _comscoreElem = document.getElementsByTagName("script")[0];
    _comscoreScript.async = true;
    _comscoreScript.src = (document.location.protocol == "https:" ? "https://sb" : "http://b") + ".scorecardresearch.com/beacon.js";
    _comscoreElem.parentNode.insertBefore(_comscoreScript, _comscoreElem);
})();
document.write("<noscript>");
document.write("<img src='http://b.scorecardresearch.com/p?c1=8&c2=6036211&c3="+comscoreCategoryId+"&c4="+comscorePlacementId+"&c5=&c6=&c15=&cv=2.0&cj=1' />");
document.write("</noscript>");var varPixel15=1;}if(window.varPixel19==undefined){if (!tmIsSecure) {
document.write('<script type="text/javascript" src="http://adadvisor.net/adscores/r.js?sid=9209810687"></scr'
+ 'ipt>');
}var varPixel19=1;}if(window.varPixel30==undefined){var varService='';
if(navigator.userAgent.match(/iphone|ipod|android/i)) {
 if ((","+varChannelIDs+",").match(/,(3|25|31),/i)) varService = 'af3';
 else if ((","+varChannelIDs+",").match(/,(5|10|21|24|32),/i)) varService = 'acf';
 else if ((","+varChannelIDs+",").match(/,(7),/i)) varService = 'af5';
 else if ((","+varChannelIDs+",").match(/,(9),/i)) varService = 'af7';
 else if ((","+varChannelIDs+",").match(/,(20),/i)) varService = 'afd';
 else if ((","+varChannelIDs+",").match(/,(11|30),/i)) varService = 'af9';
 else if ((","+varChannelIDs+",").match(/,(18|27|29),/i)) varService = 'afb';
} else if(navigator.userAgent.match(/ipad/i)){
 if ((","+varChannelIDs+",").match(/,(3|25|31),/i)) varService = 'af4';
 else if ((","+varChannelIDs+",").match(/,(5|10|21|24|32),/i)) varService = 'ad0';
 else if ((","+varChannelIDs+",").match(/,(7),/i)) varService = 'af6';
 else if ((","+varChannelIDs+",").match(/,(9),/i)) varService = 'af8';
 else if ((","+varChannelIDs+",").match(/,(20),/i)) varService = 'afe';
 else if ((","+varChannelIDs+",").match(/,(11|30),/i)) varService = 'afa';
 else if ((","+varChannelIDs+",").match(/,(18|27|29),/i)) varService = 'afc';
}

if (typeof varService != 'undefined' && varService != '')
 document.write('\x3cscript type="text/javascript" src="http://overpass.mobiletheory.com/' + varService + '?keywords=' + varTagId + '">\x3c/script>');
var varPixel30=1;}if(window.varPixel69==undefined){    var __cho__ = {"pid":2578};
    (function() {
        var c = document.createElement('script');
        c.type = 'text/javascript';
        c.async = true;
        c.src = document.location.protocol + '//cc.chango.com/static/o.js';
        var s = document.getElementsByTagName('script')[0];
        s.parentNode.insertBefore(c, s);
    })();
var varPixel69=1;}if(window.varPixel73==undefined){if (sectionTargeting.match(/prm=1/i)) {
	var xl8gValue='0';
	var xl8cValue='0';
	if ((","+varChannelIDs+",").match(/,(1),/i)) { xl8gValue='001'; xl8cValue='28632'; } /* Automotive */
	else if ((","+varChannelIDs+",").match(/,(2),/i)) { xl8gValue='002'; xl8cValue='1381193'; } /* Blogging/Design */
	else if ((","+varChannelIDs+",").match(/,(3),/i)) { xl8gValue='003'; xl8cValue='694395'; } /* Business */
	else if ((","+varChannelIDs+",").match(/,(21),/i)) { xl8gValue='004'; xl8cValue='2371756'; } /* Celebrity */
	else if ((","+varChannelIDs+",").match(/,(4),/i)) { xl8gValue='005'; xl8cValue='927050'; } /* Education */
	else if ((","+varChannelIDs+",").match(/,(5),/i)) { xl8gValue='006'; xl8cValue='23706'; } /* Entertainment */
	else if ((","+varChannelIDs+",").match(/,(22),/i)) { xl8gValue='007'; xl8cValue='20207'; } /* Family */
	else if ((","+varChannelIDs+",").match(/,(23),/i)) { xl8gValue='008'; xl8cValue='1381171'; } /* Fashion/Beauty */
	else if ((","+varChannelIDs+",").match(/,(24),/i)) { xl8gValue='009'; xl8cValue='285363'; } /* Film */
	else if ((","+varChannelIDs+",").match(/,(25),/i)) { xl8gValue='010'; xl8cValue='20205'; } /* Finance */
	else if ((","+varChannelIDs+",").match(/,(14),/i)) { xl8gValue='011'; xl8cValue='285381'; } /* Food */
	else if ((","+varChannelIDs+",").match(/,(27),/i)) { xl8gValue='012'; xl8cValue='1950176'; } /* Gadgets */
	else if ((","+varChannelIDs+",").match(/,(6),/i)) { xl8gValue='013'; xl8cValue='901810'; } /* Gaming */
	else if ((","+varChannelIDs+",").match(/,(28),/i)) { xl8gValue='014'; xl8cValue='901788'; } /* Green */
	else if ((","+varChannelIDs+",").match(/,(26),/i)) { xl8gValue='015'; xl8cValue='118748'; } /* Health/Fitness */
	else if ((","+varChannelIDs+",").match(/,(8),/i)) { xl8gValue='016'; xl8cValue='153235'; } /* Home/Gardening */
	else if ((","+varChannelIDs+",").match(/,(29),/i)) { xl8gValue='017'; xl8cValue='1381204'; } /* IT/Network */
	else if ((","+varChannelIDs+",").match(/,(7),/i)) { xl8gValue='018'; xl8cValue='314017'; } /* Lifestyle */
	else if ((","+varChannelIDs+",").match(/,(9),/i)) { xl8gValue='019'; xl8cValue='338455'; } /* Men */
	else if ((","+varChannelIDs+",").match(/,(10),/i)) { xl8gValue='020'; xl8cValue='285367'; } /* Music */
	else if ((","+varChannelIDs+",").match(/,(11),/i)) { xl8gValue='021'; xl8cValue='1547567'; } /* News */
	else if ((","+varChannelIDs+",").match(/,(12),/i)) { xl8gValue='022'; xl8cValue='700150'; } /* Photo/Video Sharing */
	else if ((","+varChannelIDs+",").match(/,(30),/i)) { xl8gValue='023'; xl8cValue='901789'; } /* Politics */
	else if ((","+varChannelIDs+",").match(/,(13),/i)) { xl8gValue='024'; xl8cValue='20209'; } /* Real Estate */
	else if ((","+varChannelIDs+",").match(/,(15),/i)) { xl8gValue='025'; xl8cValue='288656'; } /* Shopping */
	else if ((","+varChannelIDs+",").match(/,(31),/i)) { xl8gValue='026'; xl8cValue='21777'; } /* Small Business */
	else if ((","+varChannelIDs+",").match(/,(16),/i)) { xl8gValue='027'; xl8cValue='927025'; } /* Social Networking */
	else if ((","+varChannelIDs+",").match(/,(17),/i)) { xl8gValue='028'; xl8cValue='23705'; } /* Sports */
	else if ((","+varChannelIDs+",").match(/,(18),/i)) { xl8gValue='029'; xl8cValue='927073'; } /* Technology */
	else if ((","+varChannelIDs+",").match(/,(19),/i)) { xl8gValue='030'; xl8cValue='927219'; } /* Travel */
	else if ((","+varChannelIDs+",").match(/,(32),/i)) { xl8gValue='031'; xl8cValue='285364'; } /* TV */
	else if ((","+varChannelIDs+",").match(/,(20),/i)) { xl8gValue='032'; xl8cValue='1381252'; } /* Women */
	var xl8_script = document.createElement('script');
	xl8_script.src = 'http://loadus.exelator.com/load/?p=400&g=' + xl8gValue + '&c=' + xl8cValue + '&ctg=&subctg=&ag=&gd=&j=d';
	xl8_script.type = 'text/javascript';
	xl8_script.async = true;
	document.body.appendChild(xl8_script);
}var varPixel73=1;}}