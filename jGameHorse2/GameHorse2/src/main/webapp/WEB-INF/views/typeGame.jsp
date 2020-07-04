<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${Header}</title>
    </head>
    <body>
    	<h1>${Header}</h1>
        <h1>Select type game</h1>
        <form method = "GET" action = "/GameHorse2/redirectGame5x5">
        	<button type="submit">5x5</button>
        </form>
        <form method = "GET" action = "/GameHorse2/redirectGame8x8">
        	<button type="submit">8x8</button>
        </form>
    </body>
</html>
