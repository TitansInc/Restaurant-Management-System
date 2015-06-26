  try {
var _mN = _mN || {};
var iframeURL = 'http://contextual.media.net/mediamain.html?cid=8CU4CC13K&crid=972013754&pid=8POX1NKP4&size=600x250&cpnet=yVb1sHm%2B0KIh29BOFTjjrLsswDLpSZzrFWG760EF%2Fes%3D&cme=%2BGrnje2DVSUEOXxUGC8xNiavel%2FfZ5Xsnz4bMh%2Blsr2y9cSqHE3VUyQktXJ1%2BfoMvtRtwN16AdqxG3QiEzO0jyXOD8ok9MpfEOH8aE3kAHI%3D%7C%7CN7fu2vKt8%2Fs%3D%7C%2BZDUFlcRut1AyJ9%2BkjlP7SH2zgaKd0PqGDDp%2BJI18fHaa6YN1CU5QgQiThOXYl8N6gGMf8eB3j3%2F3ZaEyxwIOg%3D%3D%7CJf0d%2BWoAdPv%2BMyV4lLtttBk1KbOlw5g6mnHPUHLVwQw%3D%7C&cc=IN&bf=0&vif=1';
var locHash = '';
try{
	if(typeof _mNDetails != 'undefined' && _mNDetails['locHash'] && _mNDetails['locHash']['972013754']){ locHash += _mNDetails['locHash']['972013754'];};
	if(locHash != ''){
		locHash = '#'+locHash;
	}
	locHash += '&dytm=' + new Date().getTime();
}catch(e){}
iframeURL += locHash;
_mNDetails = (typeof _mNDetails != "undefined")?_mNDetails:{};
_mNDetails['locHash'] = _mNDetails['locHash'] || {};		
    _mNDetails['locHash']['972013754'] = locHash;
var _mN_mc_cnt = _mN_mc_cnt || 0; 
var _mN_mc_frameID = '_mN_main_972013754'+'_'+_mN_mc_cnt++;
_mNDetails = (typeof _mNDetails != "undefined")?_mNDetails:{};
_mNDetails['iframeURL'] = _mNDetails['iframeURL'] || {};
_mNDetails['iframeURL']['972013754'] = iframeURL;
_mNDetails['iframeID'] = _mNDetails['iframeID'] || {};
_mNDetails['iframeID']['972013754'] = _mN_mc_frameID; 
document.write("<iframe marginwidth='0' marginheight='0' scrolling='NO' frameborder='0' height='250' width='600' id='"+_mN_mc_frameID+"' style='display:none;' ></iframe>");
var dyncId = _mN_mc_frameID.replace("main", "dy").replace(/_[0-9]*$/g, ""); var winScope = window;window.winScope = winScope;function bidDoneListener() {
    var dyncId = "_mN_dy_972013754";
	if (winScope._mNDetails[dyncId].winProv == 1 && winScope._mNDetails[dyncId].logFunc){
		winScope._mNDetails[dyncId].logFunc.call();
	}				
}			
if(winScope._mNDetails[dyncId].winProv != 0 ) {
	bidDoneListener();
} else {
	winScope._mNDetails.addToEventQueue("bidDone", "972013754", bidDoneListener);
}		var _mN_mainCont = '<!DOCTYPE html><html><head><scr'+'ipt type="text/javascript">var  publisherScope = window.parent.winScope; var iframeID = typeof(frameID) !== "undefined" ? frameID : window.parent._mNDetails["iframeID"]["972013754"],  callback = false, dyncId = iframeID.replace("main", "dy").replace(/_[0-9]*$/g, ""),  mFrame = window.parent._mNDetails["iframeURL"]["972013754"].replace(/#.*/,"");  function processL3(){if (typeof publisherScope !== "object") {    return;}function bidDoneL3Listener() {    var dyncId = "_mN_dy_972013754";	if(publisherScope._mNDetails[dyncId].winProv == 1 ) {		loadL3();	}				}if (publisherScope._mNDetails.triggerAdTagEvent) {    publisherScope._mNDetails.triggerAdTagEvent("972013754","adContentLoaded");}if(publisherScope._mNDetails[dyncId].winProv != 0 ) {	bidDoneL3Listener();} else {	publisherScope._mNDetails.addToEventQueue("bidDone", "972013754", bidDoneL3Listener);}	} window.parent.loadL3 = loadL3; function loadL3(){parent._mN_dy.putContent(iframeID, adContent.content, "600", "250", "", "0");};function createTag() {var scr = document.createElement("script");scr.onload = scr.onreadystatechange = function () { if(typeof adContent != "undefined" && !callback) { callback = true; processL3(); } };  scr.type = "text/javascript"; scr.src = mFrame+\'&nb=1\'; scr.async = "async"; document.getElementsByTagName("head")[0].appendChild(scr);};</scr'+'ipt></head><body onload="createTag()"></body></html>';
var _mN_dy = _mN_dy || {};_mN_dy.eventLib = {
	addEvent: function (elem, type, eventHandle) {
		if(elem.addEventListener) {
			elem.addEventListener( type, eventHandle, false );
		} else if ( elem.attachEvent ) {
			elem.attachEvent( "on" + type, eventHandle );
		}
		elem = null; // Handle Memory Leak
	},
	removeEvent: function(elem, type, eventHandle) {
		if (elem.removeEventListener) {
			elem.removeEventListener(type, eventHandle);
		} else if(elem.detachEvent) {
			elem.detachEvent('on' + type, eventHandle);
		}
		elem = null;
	}
};
_mN_dy.getContent = function (data, url, w, h, id, insl) {
	var ifr = document.getElementById(id),
	errload = function(){_mN_dy.getContent(data, url, w, h, id);};
	
	if(!ifr){
		_mN_dy.eventLib.addEvent(document, 'DOMContentLoaded', errload);  
		//_mN_dy.eventLib.addEvent(window, 'load', errload);
		ifr = null;
		return;
	}
	//_mN_dy.eventLib.removeEvent(window, 'load', errload);
	var doc,
	win = ifr.contentWindow || ifr.contentDocument; 
	try { 
		doc = (win && (win.document || win)) || false;
		if(doc) {
			doc.open();
			win.frameID = id;
			doc.write(data);
			doc.close();
			win.frameID = id;
			//win.locHash = window.locHash || null;
		}
	} catch (e) { 
		_mN_dy.putContent(id, '', w, h, url, insl);
	}
}
_mN_dy.putContent = function (id, data, w, h, url, insl) {
	var ifr = document.getElementById(id), 
	mainFrame = document.createElement("iframe");
	mainFrame.marginWidth = 0;
	mainFrame.marginHeight = 0;
	mainFrame.scrolling = "no";
	mainFrame.frameBorder = 0;
	mainFrame.height = h;
	mainFrame.width = w;
	mainFrame.id = id+"_n";
	mainFrame.setAttribute('allowTransparency', "true");
	if(mainFrame.attachEvent) { mainFrame.attachEvent('onload', (function (mf) { return function() { _mN._mNVI.trigger(mf); };})(mainFrame)); } else { mainFrame.onload = function (){ var doc = this.contentWindow.document; if(doc && doc.body && doc.body.firstChild) { _mN._mNVI.trigger(this); } } }
	if(url != '' && data == ''){
		mainFrame.src = url;
	}
	ifr.parentNode.insertBefore(mainFrame, ifr);
	if(url != '' && data == ''){
		mainFrame.parentNode.removeChild(ifr);
		return;
	}
	
	var win = mainFrame.contentWindow || mainFrame.contentDocument,
	doc = (win && (win.document || win)) || false;
	if(doc) { 
		try {
			if(/msie/.test(navigator.userAgent.toLowerCase())){
				throw 10;
			}
			doc.open();
			win.frameId = id+"_n";
			doc.write(data);
			doc.close();
			win.frameId = id+"_n";
			//win.locHash = window.locHash || null;
		} catch (e) { 
			win.data = data;
			doc.location.replace('javascript:window["data"];');
		}
		if(insl && insl == '1'){
			_mN_dy.inttAd && _mN_dy.inttAd.init && _mN_dy.inttAd.init(mainFrame);
		}
		mainFrame.parentNode.removeChild(ifr);
	}
}; _mN_dy["ha_972013754"] = (function(){ var id = _mN_mc_frameID+"_n"; return function (){  if(document.getElementById(id)){document.getElementById(id).style.display="none";}};})(); _mN_dy.getContent(_mN_mainCont, iframeURL, '600', '250', _mN_mc_frameID, '0');var _mNDetails = _mNDetails || parent._mNDetails || {} ;
_mNDetails.hmDataLogServer = "http://hm.medianetadvertising.com/heatmap-revamped/heatmaplog.php";
_mNDetails.hmDataSendInterval = "7000";
_mNDetails.hmMouseMovementLag = "2000";
_mNDetails.hmMouseMovementTTL = "2000";
_mNDetails.hmLogPercent = "100";

_mNDetails.scrollMapLogServer =  "http://hm.medianetadvertising.com/heatmap-revamped/scrolllog.php";
_mNDetails.smLogPercent = "100";
_mNDetails.smUserInactivePeriod = "5000" ;
_mNDetails.smScrollEventInterval = "200" ;
_mNDetails.smScrollDataSendInterval = "10000" ;
_mNDetails.scrollLogLag = "5000";
_mNDetails.scrollLogTTL = "5000";

_mNDetails.emLogPercent = "0";
_mNDetails.emDataLogServer = "http://searchl.media.net/__media__/js/ping.php";
_mNDetails.emDataSendInterval = "3000" ;

_mNDetails.hmscriptSrc = "http://res.media.net/__media__/js/util/heatmapclient.js";
_mNDetails.smscriptSrc = "http://res.media.net/__media__/js/util/scrollmapclient.js";
_mNDetails.emscriptSrc = "http://res.media.net/__media__/js/util/engagementclient.js";
_mNDetails.requrl = "http%3A%2F%2Fseminarprojects.com%2FThread-crime-management-system";
(function(){function a(f){var d=document.createElement("script"),c=document.getElementsByTagName("script"),e=c[c.length-1];d.type="text/javascript";d.src=f;d.async="async";e.parentNode.insertBefore(d,e)}function b(){return(/iphone|ipad|android|symbian|blackberry/.test(navigator.userAgent.toLowerCase()))||!!("ontouchstart" in window)||!!("onmsgesturechange" in window)}if(window.JSON&&typeof(window.JSON.stringify)=="function"){if(_mNDetails.hmLogPercent>0){a(_mNDetails.hmscriptSrc)}if(_mNDetails.smLogPercent>0&&!b()){a(_mNDetails.smscriptSrc)}if(_mNDetails.emLogPercent>0&&!b()){a(_mNDetails.emscriptSrc)}}})();} catch (err){
					var _mNerrStacktrace = '';
					if (err.stack) {_mNerrStacktrace = err.stack;}
					else if (err.s) {_mNerrStacktrace = err.s;}
					else if (err.stacktrace) {_mNerrStacktrace = err.stacktrace;}
					else _mNerrStacktrace = 'No StackTrace';
					
					var _mNobjTrace = '';
					for ( var x in err) {
						if (err.hasOwnProperty && err.hasOwnProperty(x)) {
							_mNobjTrace += x + " : '" + err[x] + "',";  
						}
					}
					
					var _mNurlsrc = 'http://qsearch.media.net/errping.php?&msg='+encodeURIComponent(_mNerrStacktrace)+'&err='+encodeURIComponent(err)+'&errObj='+encodeURIComponent(_mNobjTrace)+'&script=DynamicLayer&cid=8CU4CC13K&crid=972013754';
					var _mNImgx  = new Image();
					_mNImgx.src = _mNurlsrc ;
			}