

function  aax_punt () {

	  var size = aax_size.split("x");
          size = "width=\"" + size[0] + "\" height=\"" + size[1] + "\"";
	  html = '<iframe src="//c.amazon-adsystem.com/aax2/assoc_lra.html?tag='+aax_pubname + '&c='+aax_channel+'&src='+aax_src+'&sz='+aax_size+'" '+size+' scrolling="no" border="0" marginwidth="0" style="border:none;" frameborder="0"></iframe>';	

	  document.write(html);	
	  document.close();
}


function aax_render_ad(ad) {
    if(typeof ad.html == "undefined" || ad.html=="") {
      aax_punt();
      return;
    }
    document.write(ad.html);
}

try {

	var params = {};
	
	if(typeof aax_src == "undefined") aax_src = 300;
	if(typeof aax_channel == "undefined") aax_channel = 100;

	params["src"] = aax_src;
	params["c"] = aax_channel;
	params["sz"] = aax_size;
	params["ec"] = 0;
	params["u"] =  document.location;
	params["ec"] = 0;
	
	try {
		params["u"] = "" + window.top.location;
	} catch(e) {
	}
	
	if(typeof aax_pubname == "undefined") aax_pubname = "";
	if(typeof aax_refurl != "undefined") params["u"] = aax_refurl;
	if(typeof aax_clickurl != "undefined") params["ct"] = aax_clickurl;
	
	if(typeof aax_clickurlparams != "undefined") params["cup"] = aax_clickurlparams;
	else params["cup"] = '{linkCode:"ax1",tag:"'+aax_pubname+'"}';
        params["pub"] = aax_pubname;


	var href = '';
	for (var key in params) {
		 href += key + "=" + encodeURIComponent(params[key]) + "&";
	}
	
	href += "rnd=" + Math.round(Math.random()*1000000);
	var aaxserver = "aax-eu";
	if(aax_src=="300" || aax_src=="301") aaxserver = "aax-us-east";
	document.write("<scr"+"ipt src='//"+aaxserver+".amazon-adsystem.com/x/getad?" + href + "'></scr"+"ipt>");
	document.close();
} catch(e) {
  	aax_punt();
}
