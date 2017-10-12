/*$(document).ready(function(){
	
	alert("hello选择器！！！！");
})
*/
/*function on(){
 	* 
	var d=document.getElementById("_p");
		 //var _style="	background-color: hotpink;";
	     //d.setAttribute("style",_style);
	     
     alert(d);
}*/
     

//1,改变id为one的元素的背景色
/*$(function(){
    //alert("hello选择器2！！！！");
      
         var d=$("#one").get(0);//得到数组中的p元素
         //定义一个样式
         var _style="background-color: hotpink;";
         //设置样式style=
          d.setAttribute("style",_style);
})*/
//2,改变class为mini的所有元素的背景色
/*$(function(){
	//获取数中class
	var d=$(".mini").get(0);
	
	var _style="background-color:red";
     //设置样式style=
     d.setAttribute("style",_style);
	//alert(d);
})*/

//3,改变元素名为div的所有元素的背景色
/* $(function(){
	    
	var _div=$("div").get();//obj-->数组
	
	
	for(var i=0;i<_div.length;i++){
		 var alldiv =_div[i];
		 console.log(alldiv);
       var _style="background-color:red";
     //设置样式style=
       alldiv.setAttribute("style",_style);
	}
	
	  	    
})*/


//4,改变所有元素的背景色
$(function(){
	 //var eles = document.getElementsByTagName('*');
	var all=$("*").get(); //obj-->数组
	//alert(all);
	for(var i=0;i<all.length;i++){
	    var all=all[i];
	    console.log(all);
	    var _style="background-color:red";
	      all.setAttribute("style",_style);
	      
	}
})






//5,改变所有的span元素和id为two的元素的背景色

/*$(function(){
	
	var two=$("#two").get(0);
	//console.log(span);
	
	 var _style="background-color:red";
	  two.setAttribute("style",_style);
	  
	  var s_span=$("span").get();
	  
	  for(var i=0;i<s_span.length;i++){
	  	 var allp=s_span[i];
	  	console.log(allp);
	  	 var _style="background-color:red";
	  allp.setAttribute("style",_style);
	  }
	
	
	
})*/
//层次选择器
//1,改变body内所有div的背景色
/*$(document).ready(function(){
	
	var dd=$("div").get();
	for(var i=0;i<dd.length;i++){
		var alldd=dd[i];
    var _style="background-color:red";
	  alldd.setAttribute("style",_style);
	}
	//console.log(dd);
	
})*/

//2,改变body内子div元素的背景色

/*$(document).ready(function(){
	
	var dd=$("div span").get();
		//console.log(dd);
	for(var i=0;i<dd.length;i++){
		var alldd=dd[i];
			//console.log(alldd);
    var _style="background-color:red";
	  alldd.setAttribute("style",_style);
	}

	
})*/

//3,改变class为one的下一个div同辈元素背景色
/* $(function(){
 	var ss=$(".one+div").get();
 	for(var i=0;i<ss.length;i++){
 		var allss=ss[i];
 		 var _style="background-color:red";
	  allss.setAttribute("style",_style);
 	}
 	//console.log(ss);
 })
*/


//4,改变id为two的元素后面的所有div同辈元素的背景色
/*$(function(){
 	var ss=$("#two~div").get();
 	for(var i=0;i<ss.length;i++){
 		var allss=ss[i];
 		 var _style="background-color:red";
	  allss.setAttribute("style",_style);
 	}
 	//console.log(ss);
 })*/


//过滤选择器=========
//基本过滤选择器
//1,改变第一个div元素的背景色
/*$(function(){
	var dd=$("div:first")[0];
	var _style="background-color:red";
	dd.setAttribute("style",_style);
	console.log(dd);
	
})
*/




//2,改变最后一个div元素的背景色
/*$(function(){
	var dd=$("div:last").get(0);
	var _style="background-color:red";
	dd.setAttribute("style",_style);
	console.log(dd);
	
})
*/
//3,改变class不为one的div元素的背景色
/*$(function(){
		var dd=$("div:not(.one)").get();
		console.log(dd);
		for(var i=0;i<dd.length;i++){
			var dde=dd[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}

})*/
//4,改变索引值为偶数的div元素的背景色

/*  $(function(){
  	var cc=$("div:even").get();
  	console.log(cc);
	for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}

  })*/




//5,改变索引值为奇数的div元素的背景色
/* $(function(){
  	var cc=$("div:odd").get();
  	console.log(cc);
	for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}

  })*/



//6,改变索引值等于3的div元素的背景色

/* $(function(){
  	var cc=$("div").get(3);
  	console.log(cc);

			
			var _style="background-color:red";
	       cc.setAttribute("style",_style);
		

  })*/
//7,改变索引值大于3的div元素的背景色
/*$(function(){
	var cc=$("div:gt(3)").get();
  	console.log(cc);
  	for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}

})*/


//8,改变索引值小于3的div元素的背景色
/*$(function(){
	var cc=$("div:lt(3)").get();
  	console.log(cc);
  	for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
})*/


//9,改变所有的标题元素，例如h1、h2、h3...这些元素的背景色
/*$(function(){
	var cc=$(":header").get();
	console.log(cc);
	for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
})
*/


//10,改变当前正在执行动画的元素的背景色
/*$(document).ready(function(){
	var cc=$("div:animated").get();
	console.log(cc);
})*/
//11,改变当前获取焦点的元素的背景色
/*$(
   function(){
   
  var cc=$("#login:focus ").get(0);
    var _style="background-color:red";
     cc.setAttribute("style",_style);
    console.log(cc);
   //console.log(cc.length);
   
   }
)*/
   
     
   
//内容过滤选择器==================
//1,改变含有文本"di"的div元素的背景色
/*$(function(){
var cc=	$("div:contains('di')").get();
console.log(cc);
for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
})
*/
//2,改变不包含子元素(包括文本元素)的div空元素的背景色
/*$(function(){
var cc=	$("div:empty").get();
console.log(cc);
for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
})*/




//3,改变含有class为mini元素的div元素背景色
          
/*$(function(){
var cc=	$("div .mini:parent").get();
console.log(cc);
for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
})*/


//4,改变含有子元素(包括文本元素)的div元素的背景色
/*$(function(){
	var cc=$("div:parent").get();
	console.log(cc);
	for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
})*/



//可见性过滤选择器=====
//1,改变所有可见的div元素的背景色
/*$(function(){
	var cc=$(":hidden").get();
	console.log(cc);
	for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
})*/

//2,显示隐藏的div元素
/*$(function(){
	var cc=$("div:visible").get();
	console.log(cc);
	for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
})*/

//属性过滤选择器=====
//1,改变含有属性"title"的div元素的背景色
/*$(function(){
     var cc=$("div[title]").get();
     console.log(cc);
     for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
	
})*/
//2,改变属性title值等于"test"的div元素的背景色

/*$(function(){
     var cc=$("div[title=test]").get();
     console.log(cc);
     for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
	
})*/

//3,改变属性title值不等于"test"的div元素的背景色
/*$(function(){
     var cc=$("div[title!=test]").get();
     console.log(cc);
     for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
	
})*/
//4,改变属性title值以"te"开始的div元素的背景色
/*$(function(){
     var cc=$("div[title^=test]").get();
     console.log(cc);
     for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
	
})*/
//5,改变属性title值以"est"结束的div元素的背景色

/*$(function(){
     var cc=$("div[title$=est]").get();
     console.log(cc);
     for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
	
})*/
//6,改变属性title值含有"es"的div元素的背景色
/*$(function(){
     var cc=$("div[title*=es]").get();
     console.log(cc);
     for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
	
})*/

//7,改变含有属性id，并且属性title值含有"es"的div元素的背景色
/*$(function(){
     var cc=$("div[id][title|=es]").get();
     console.log(cc);
    for(var i=0;i<cc.length;i++){
			var dde=cc[i];
			console.log(dde);
			var _style="background-color:red";
	       dde.setAttribute("style",_style);
		}
	
})*/



//jQuery属性选择器的过滤规则比较多，特别容易混淆。为此，把几个容易混淆的单独做了一个例子，加强印象
//1,改变属性title值以"en"开始的div元素的背景色
/* $(function(){
 	var cc=$("div[title|=en]").get();
 	//console.log(cc);
 	for(var i=0;i<cc.length;i++){
 		var ccd=cc[i];
 		console.log(ccd);
 		var _style="background-color:red";
	     ccd.setAttribute("style",_style);
 	}
 	
 })*/
//2,改变属性title值含有"en"的div元素的背景色
/*   $(function(){
 	var cc=$("div[title*=en]").get();
 	console.log(cc);
 	for(var i=0;i<cc.length;i++){
 		var ccd=cc[i];
 		console.log(ccd);
 		var _style="background-color:red";
	     ccd.setAttribute("style",_style);
 	}
 	
 })*/

//3,改变属性title值等于"en"或以"en"为前缀(该字符串后跟一个连字符'-')的div元素的背景色
/*$(function(){
 	var cc=$("div[title$=en]").get();
 	console.log(cc);
 	for(var i=0;i<cc.length;i++){
 		var ccd=cc[i];
 		console.log(ccd);
 		var _style="background-color:red";
	     ccd.setAttribute("style",_style);
 	}
 	
 })*/
//4,改变属性title用空格分隔的值中包含字符uk的元素的背景色
/*$(function(){
 	var cc=$("div[title*= uk]").get();
 	console.log(cc);
 	for(var i=0;i<cc.length;i++){
 		var ccd=cc[i];
 		console.log(ccd);
 		var _style="background-color:red";
	     ccd.setAttribute("style",_style);
 	}
 	
 })*/
//子元素过滤选择器==============================
//1,改变每个class为one的div父元素下的第2个子元素的背景色
/*$(function(){
	var cc=$(".one:first+div").get(0);
	console.log(cc);
	var _style="background-color:red";
	cc.setAttribute("style",_style);
})*/
//2,改变每个class为one的div父元素下的第1个子元素的背景色
/*$(function(){
	var cc=$(".one:first").get(0);
	console.log(cc);
	var _style="background-color:red";
	cc.setAttribute("style",_style);
})*/
//3,改变每个class为one的div父元素下的最后一个子元素的背景色
/*$(function(){
	var cc=$(".one:last").get(0);
	console.log(cc);
	var _style="background-color:red";
	cc.setAttribute("style",_style);
})*/
//4,改变每个class为one的div父元素下只有一个子元素，那么则改变这个子元素的背景色
/*$(function(){
	var cc=$(".one>div").get(0);
	console.log(cc);
	var _style="background-color:red";
	cc.setAttribute("style",_style);
})*/

//表单对象属性过滤选择器=====================


//1,改变表单内可用input元素的值
/* $(function(){
  	
    //cc=$("input[type='text']:enabled");
    var cc=$("input[value|=可用文本框]").get();
    	console.log(cc);
    for(var i=0;i<cc.length;i++){
    var dd=cc[i];
    //var cc=$("input:text").get(3).value;
  	console.log(dd);
  	var _value="这是可用的";
  	 	var _style="background-color:green";
	dd.setAttribute("style",_style);
  	dd.setAttribute("value",_value);
    
    }
  	

  	
  })
*/
//2,改变表单内不可用input元素的值
/*
  $(function(){
  	
    //cc=$("input[type='text']:enabled");
    var cc=$("input[value|=不可用文本框]").get();
    	console.log(cc);
    for(var i=0;i<cc.length;i++){
    var dd=cc[i];
    //var cc=$("input:text").get(3).value;
  	console.log(dd);
  	var _value="这是不可用的";
  	var _style="background-color:red";
	dd.setAttribute("style",_style);
  	dd.setAttribute("value",_value);
    
    }
  	

  	
  })

*/

//3,获取多选框选中的个数
/*$(
   function(){
    var cc=$(":checkbox").get();
    
    console.log(cc);
   console.log(cc.length);
     for(var i=0;i<cc.length;i++){
      var all=cc[i];
      //console.log(all.value);
      
     }
   }
)*/

//4,获取下拉框选中的内容

/*$(
   function(){
    var cc=$("select option").get();
    
    console.log(cc);
   console.log(cc.length);
     for(var i=0;i<cc.length;i++){
      var all=cc[i];
      console.log(all.value);
      
     }
   }
)
*/