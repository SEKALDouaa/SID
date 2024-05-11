<!DOCTYPE html>
<html>
<head>
    <title>Affichage du PDF</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            padding: 20px;
        }

        .container {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            margin: 0 auto;
            max-width: 800px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        p {
            line-height: 1.6;
            color: #666;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Contenu du PDF</h1>
        <p>${requestScope.pdfText}</p>
    </div>
</body>
</html>
