# ECommerce Search App
<p align="justify">An app that supports an ecommerce portal in order to query for different shopping items and to display the best out of the available options. This app also provides a functionality of sharing this result with nearby users via bluetooth. This app makes use of Retrofit 2.0 API and includes advanced concepts such as databinding for callbacks and animations.</p>

<p align="justify">This search results into an extraction of the JSON data from the REST endpoint directed by the Zappos API. This extraction is done using the Retrofit 2.0 API that will get the top result from the REST endpoint and the product will be displayed in an another activity as a Product page. This will contain the details of the product such as the Original price, Name of the product, discount on the product and the current price after the discount.</p>

<p align="justify">This product page also has a floating action button that will allow you to share the product details with an other user of the app using the bluetooth module. An additional feature of logging in and out of the app has been provided using the Google SignIn API which implements the OAuth 2.0 protocol and thereby making the shopping or product search experience secure to use. This authentication acts as a session and can be logged out from the product details page. User friendly features such as portrait and landscape modes have been enabled for a few activities.</p>

<p align="justify">The animation of the floating action buttons on the product page results into it turning 45 degrees and popping another floating action button for sharing the device details via bluetooth. This button press results into listing a host of bluetooth devices being populated on an activity as a list on clicking which sends the details of the product to another device via bluetooth.</p>

<strong>Special Features Used:</strong>
<ol>
<li> Data Biniding</li>
<li> Retrofit 2.0</li>
<li> Animation - rotation, scaling, translation, elevation</li>
<li> Bluetooth Module implemented</li>
<li> Networking Module implemented for socket programming</li>
<li> Signin options with security - OAuth 2.0 protocol</li>
</ol>




