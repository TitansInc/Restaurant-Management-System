(function(){function m(i){var H=new Image();H.src=i}function e(H){if(A.length>0){g=true;var i=w+"?mm="+encodeURIComponent(JSON.stringify(b))+"&mc="+encodeURIComponent(JSON.stringify(A))+"&ref="+o;m(i);b=[];A=[];g=false;setTimeout(e,r)}else{setTimeout(e,1000)}}function D(i){if(b.length<10&&(Math.random()*100)<50){var H=d(i);if((typeof H)==="object"){b.push(H)}}}function t(i){var H=d(i);if((typeof H)==="object"){A.push(H)}}getElementXPath=function(i){return this.getElementTreeXPath(i)};getElementTreeXPath=function(J){var L=[];for(;J&&J.nodeType==1;J=J.parentNode){var H=0;for(var K=J.previousSibling;K;K=K.previousSibling){if(K.nodeType==10){continue}if(K.nodeName==J.nodeName){++H}}var I=J.nodeName.toLowerCase();var i=(H?"["+(H+1)+"]":"");L.splice(0,0,I+i)}return L.length?"/"+L.join("/"):null};function u(i){var H=curtop=0;if(i.offsetParent){do{H+=i.offsetLeft;curtop+=i.offsetTop}while(i=i.offsetParent)}return[H,curtop]}function n(I){var N,L,H,i,K,J,M;N=I.clientX;L=I.clientY;K=f.pageXOffset||l.scrollLeft;J=f.pageYOffset||l.scrollTop;N+=K;L+=J;M=[N,L];return M}function C(L){var I=L.target||L.srcElement,H=u(I),M=n(L),i=I.getBoundingClientRect(),K;if(i){K=[i.width,i.height]}else{K=[I.clientWidth,I.clientHeight]}var J={};J.x=(M[0]-H[0])/K[0];J.y=(M[1]-H[1])/K[1];return{xPath:getElementXPath(I),x:J.x,y:J.y}}function d(i){var I;try{if(g){return I}I=C(i)}catch(H){}return I}function q(i,I,H){if(document.addEventListener){i.addEventListener(I,H,false)}else{if(attachEvent){i.attachEvent("on"+I,H)}}}function v(i,I,H){if(document.removeEventListener){i.removeEventListener(I,H)}else{if(detachEvent){i.detachEvent("on"+I,H)}}}function h(L,I,K,J,H,i){if(L===true){v(I,K,J);L=false;setTimeout(function(){h(L,I,K,J,H,i)},H)}else{if(L===false){q(I,K,J);L=true;setTimeout(function(){h(L,I,K,J,H,i)},i)}}}function G(H){if(b.length+A.length>0){var i=w+"?mm="+encodeURIComponent(JSON.stringify(b))+"&mc="+encodeURIComponent(JSON.stringify(A))+"&ref="+o;m(i);A=[];b=[]}}function s(){try{if(window.top!=window){f=(window.top==window.parent&&window.parent)}if(Math.floor(Math.random()*100)>E){B=false}if(_mNDetails.hmStatus2==undefined){_mNDetails.hmStatus2=1}else{B=false}}catch(i){B=false;f=false}}var o=_mNDetails.requrl,F="",l="",w=_mNDetails.hmDataLogServer,x=true,b=[],A=[],g=false,r=_mNDetails.hmDataSendInterval,c=_mNDetails.hmMouseMovementLag,k=_mNDetails.hmMouseMovementTTL,E=_mNDetails.hmLogPercent,B=true,z,a,p,y,j=["chrome","firefox","safari","msie","opera","omniweb","crazy","netcaptor","avant","msn","powermarks","konqueror","zyborg","galeon","nautilus","firebird","phoenix","chimera"],f=window;s();if(f){l=f.document.documentElement&&f.document.documentElement.clientHeight!==0?f.document.documentElement:f.document.body;a=navigator.userAgent?navigator.userAgent.toLowerCase().replace(/-/g,""):"";F="unknown";for(z=0;z<j.length;z+=1){if(a.indexOf(j[z])!==-1){F=j[z];break}}y=l.clientWidth||f.innerWidth;if(y<990){B=false}if(B){h(false,f.document,"mousemove",D,c,k);if(/complete|loaded/.test(document.readyState)){e()}else{q(f,"load",e)}q(f.document,"click",t);if(F==="firefox"||F==="chrome"){f.addEventListener("pagehide",G,false)}else{if(F==="msie"){f.attachEvent("onunload",G)}}}}}());