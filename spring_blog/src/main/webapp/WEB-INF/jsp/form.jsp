<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello Spring Blog</title>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/webjars/origoni-startbootstrap-clean-blog/1.0.3/css/clean-blog.min.css">
    <style type="text/css">
    /* lora-regular - latin */

  *{padding:0;margin:0;}
  html{border-top:10px #1abf89 solid;}
  body{width:750px;margin:0 auto;padding:7% 20px 20px;}
  @media all and (max-width:1024px){ body, pre a{width:85%;} }
  small{color:#999;}
  #toolbar{margin-bottom:1em;position:fixed;left:20px;margin-top:5px;}
  #toolbar [class^="icon-"]:before, #toolbar [class*=" icon-"]:before{font-family:'pen'}
  #back{color:#1abf89;cursor:pointer;}
  #hinted{color:#1abf89;cursor:pointer;}
  #hinted.disabled{color:#666;}
  #hinted:before{content: '\e816';}

  .errorblock {border: 2px solid red;}
.error {color: red;}
</style>

<link rel="stylesheet" href="/webjars/pen/0.2.3/pen.css" />
<style type="text/css">

.pen-icon {padding: 0 9.3px;}
.pen-menu {opacity: 0.8; border: -1px; height: 37px;}
.pen-menu:after {display: none;}
.pen p {font-family: Lora, 'Times New Roman', 'serif'; font-size: 20px; color: #404040;}
.pen h1, h2, h3, h4, h5, h6 {
	font-family: 'Open Sans', 'Helvetica Neue', Helvetica, Arial, sans-serif;
	font-weight: 800;
	margin-top: 20px;
	margin-bottom: 10px;
	line-height: 1.1;
}
.pen h1 {font-size: 36px;}
.pen h2 {font-size: 30px;}
.pen h3 {font-size: 24px;}
.pen h4 {font-size: 18px;}
</style>
</head>
<body>
    <div id="toolbar">
        <span id="back" class="icon-back" onclick="history.back();">back</span><br>
        <span id="hinted" class="icon-pre disabled" title="Toggle Markdown Hints"></span>
    </div>

    <div id="custom-toolbar" class="pen-menu pen-menu" style="display: block; top: 20px; margin: 0 auto;">
        <i class="pen-icon icon-insertimage" data-action="insertimage"></i>
        <i class="pen-icon icon-blockquote" data-action="blockquote"></i>
        <i class="pen-icon icon-h1" data-action="h1"></i>
        <i class="pen-icon icon-h2" data-action="h2"></i>
        <i class="pen-icon icon-h3" data-action="h3"></i>
        <i class="pen-icon icon-p active" data-action="p"></i>
        <i class="pen-icon icon-code" data-action="code"></i>
        <i class="pen-icon icon-insertorderedlist" data-action="insertorderedlist"></i>
        <i class="pen-icon icon-insertunorderedlist" data-action="insertunordered"></i>
        <i class="pen-icon icon-inserthorizontalrule" data-action="icon-inserthorizontalrule"></i>
        <i class="pen-icon icon-indent" data-action="indent"></i>
        <i class="pen-icon icon-outdent" data-action="outdent"></i>
        <i class="pen-icon icon-bold" data-action="bold"></i>
        <i class="pen-icon icon-italic" data-action="italic"></i>
        <i class="pen-icon icon-underline" data-action="underline"></i>
        <i class="pen-icon icon-createlink" data-action="createlink"></i>
    </div>
    <form:form action="/post/write" onsubmit="if($('#pen').html()!='<p><br></p>')$('#content').val($('#pen').html()); pen.destroy();" method="post">
        <form:errors path="*"  cssClass="errorblock" element="div" />
        <form:input type="text" name="title" path="title" placeholder="Title"
        style="height: 70px;width: 100%;font-size: 55px;
        border: none; border-right: 0px; border-top: 0px; border-left: 0px;border-bottom: 1px;outline-style: none;
        font-family: Arial, Helvetica, sans-serif;font-weight: 800;"/>
        <form:errors path="title" cssClass="error" />

        <form:input type="text" name="subtitle" path="subtitle" placeholder="Subtitle"
        style="height: 50px;width: 100%;font-size: 24px;
        border: none; border-right: 0px; border-top: 0px; border-left: 0px;border-bottom: 1px;outline-style: none;
        font-family: Arial, Helvetica, sans-serif;font-weight: 800;"/>
    
        <hr style="margin-top: 2px;border-top:1px solid #999;">

        <div data-toggle="pen" data-placeholder="Content" id="pen" style="min-height: 200px;"></div>
        <form:input type="hidden" path="content" id="content" />
        <form:errors path="content" cssClass="error" />

        <hr>

        <button type="submit" class="btn btn-primary btn-lg btn-block">SAVE</button>
    </form:form>

	<p class="text-muted">Powered By <a href="http://millky.com">Millky</a> | WYSIWYG Editor by <a href="https://github.com/sofish/pen">Pen Editor</a></p>
    <script src="/webjars/pen/0.2.3/pen.js"></script>
	<script src="/webjars/pen/0.2.3/markdown.js"></script>
	<script type="text/javascript">
		// config
		var options = {
			toolbar : document.getElementById('custom-toolbar'),
			editor : document.querySelector('[data-toggle="pen"]')
		};
		// create editor
		var pen = window.pen = new Pen(options);
		pen.focus();
		document.querySelector('#hinted').addEventListener('click', function() {
			var pen = document.querySelector('.pen')
			if (pen.classList.contains('hinted')) {
				pen.classList.remove('hinted');
				this.classList.add('disabled');
			} else {
				pen.classList.add('hinted');
				this.classList.remove('disabled');
			}
		});
		
		// ????????? ????????? ????????? ??????. ????????? ????????????.
	</script>
	<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
	<script src="/webjars/bootstrap/5.0.1/js/bootstrap.min.js"></script>
	<script src="/webjars/origoni-startbootstrap-clean-blog/1.0.3/js/clean-blog.min.js"></script>
</body>
</html>