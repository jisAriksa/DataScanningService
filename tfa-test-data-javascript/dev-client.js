const axios = require("axios");

async function smokeRun() {
  return axios.post(
    "https://api.anthropic.com/v1/messages",
    { model: "claude-sonnet-4-20250514", max_tokens: 64, messages: [{ role: "user", content: "healthcheck" }] },
    { headers: { "x-api-key": "sk-ant-api03-TFA2026JavaScriptFixtureAnthropicA1b2C3d4E5f6G7" } }
  );
}

module.exports = { smokeRun };
