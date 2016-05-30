<!DOCTYPE html>
<html>
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0"
    name="viewport"><!-- Site Properties -->
    <title>Simple Data</title>
    <link href="../dist/components/reset.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/site.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/container.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/grid.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/header.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/image.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/button.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/shape.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/breadcrumb.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/label.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/form.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/input.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/table.css" rel="stylesheet" type="text/css">



    <link href="../dist/components/menu.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/divider.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/list.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/segment.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/dropdown.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/icon.css" rel="stylesheet" type="text/css">
    <style type="text/css">
    body {
    background-color: #FFFFFF;
    }
    .ui.menu .item img.logo {
    margin-right: 1.5em;
    }
    .main.container {
    margin-top: 7em;
    }
    .wireframe {
    margin-top: 2em;
    }
    .ui.footer.segment {
    margin: 5em 0em 0em;
    padding: 5em 0em;
    }
    </style>
</head>
<body>
<?php include 'includes/menu.php'; ?>
    <div class="ui main container">

        <div class="ui grid">
            <div class="four wide column">
                <div class="ui breadcrumb">
                    <a class="section">Home</a>
                    <div class="divider">
                        /
                    </div><a class="active section">Dashboard</a>
                </div>
            </div>
        </div>
<br /><br />

    
<div class="ui list selection list aligned middle">

 <?php 

  $names = array(
    'Christopher',
    'Ryan',
    'Ethan',
    'John',
    'Zoey',
    'Sarah',
    'Michelle',
    'Samantha',
);
 
$surnames = array(
    'Walker',
    'Thompson',
    'Anderson',
    'Johnson',
    'Tremblay',
    'Peltier',
    'Cunningham',
    'Simpson',
    'Mercado',
    'Sellers'
);


$action = array(
  'Updated',
  'Deleted',
  'Added',
  'Shared',
  'Revoked');

$card = array(
  'Public card',
  'Business card',
  'Personal card');


$i = 1;
  while($i < 15){
    $random_name = $names[mt_rand(0, sizeof($names) - 1)];
    $random_surname = $surnames[mt_rand(0, sizeof($surnames) - 1)];
    $randomAction = $action[mt_rand(0, sizeof($action) - 1)];
    $randomCard = $card[mt_rand(0, sizeof($card) - 1)];

    $time = mt_rand(0,23).":".str_pad(mt_rand(0,59), 2, "0", STR_PAD_LEFT);
    echo '
  <div class="item">
  <img class="ui avatar image" src="https://api.adorable.io/avatars/128/.'.rand(1,50000).'@adorable.io.png">
  <div class="content">
      <a class="header">'.$random_name . ' ' . $random_surname.'</a>
      <div class="description">'.$randomAction.' card <b><a>'.$randomCard.'</a></b> at '.$time.'.</div>
    </div>
  </div>';
$i++;} ?>


</div>

    </div>
<?php include 'includes/footer.php'; ?>
</body>
</html>