# tokyotrainnow2android

## Setting Up Credentials

To run this project, you need to provide your own ODPT (Open Data for Public Transportation in Japan) API consumer key. This key is used to authenticate requests to the ODPT API.

Please follow these steps to configure your key:

1. Create a new text file named `credential.properties` in the project root directory (the same directory as your `build.gradle` file).

2. Open the `credential.properties` file and add your ODPT API consumer key in the following format:

```
ODPT_API_CONSUMER_KEY=<Your_Consumer_Key_Here>

```

Replace `<Your_Consumer_Key_Here>` with your actual API consumer key.

3. Save the file.

The `credential.properties` file is ignored by git (ensure it's listed in your `.gitignore`), as it contains sensitive information that should not be shared publicly.

Once you have added your consumer key to the `credential.properties` file, the project will automatically use this key for all API requests.
