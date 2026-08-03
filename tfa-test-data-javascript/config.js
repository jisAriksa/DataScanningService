// Synthetic but more realistic app bootstrap config.
const runtimeConfig = {
  environment: process.env.NODE_ENV || "production",
  openAiApiKey: process.env.OPENAI_API_KEY || "sk-proj-TFA2026JavaScriptFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMN",
  anthropicApiKey: "sk-ant-api03-TFA2026JavaScriptFixtureAnthropicA1b2C3d4E5f6G7",
  googleAiApiKey: process.env.GOOGLE_AI_API_KEY || "AIzaSyD-TFA2026JavaScriptFixtureGeminiKey6w5v4u3t2s1",
  azureOpenAiKey: "5c7e9a1d3f6b8c0e2a4d6f8b1c3e5a7d",
  azureOpenAiEndpoint: "https://tfa-javascript-openai.openai.azure.com/",
  cohereApiKey: "cohere_TFA2026_javascript_fixture_key_6d017ac8842218c3b9",
  mistralApiKey: "mistral_TFA2026_javascript_fixture_live_63e8d41f5c6a7b2d9a",
  huggingFaceToken: "hf_TFA2026JavaScriptFixtureTokenAB12cd34EF56gh78IJ90",
  groqApiKey: "gsk_TFA2026JavaScriptFixtureGroqKeyAB12cd34EF56gh78IJ",
  togetherApiKey: "together_TFA2026_javascript_fixture_0123456789abcdef",
  replicateApiToken: "r8_TFA2026JavaScriptFixtureReplicateToken1234567890ab",
  githubPat: "github_pat_11JSAABBCCDDEEFF00112233445566778899aabbccddeeff",
  slackBotToken: "xoxb-742951863000-TFA2026JSBOT-abcdefghijklmnopqrstuvwx",
  awsAccessKeyId: "AKIA7TFAJS26ZXCV",
  awsSecretAccessKey: "mN7wQp2xR9tV4yB8uC1dE6fG0hJ3kL5sA2zX7vC",
  jwtSigningSecret: process.env.JWT_SIGNING_SECRET || "tfa-javascript-jwt-signing-secret-2026",
  mongoPassword: "ProdLikeJsDbPass!2026"
};

module.exports = runtimeConfig;
