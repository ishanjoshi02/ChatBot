<?xml version="1.0" encoding="ISO-8859-1"?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
  <head>
    <title>Reseting Session...</title>
    <link rel="stylesheet" type="text/css" href="style.css" />
  </head>
  <body>
    <jsp:scriptlet>session.invalidate();</jsp:scriptlet>
  
    <jsp:forward page="console.jsp" />
  </body>
</html>
