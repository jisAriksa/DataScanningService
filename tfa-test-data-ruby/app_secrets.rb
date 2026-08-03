module Tfa
  module Scanner
    class AppSecrets
      VALUES = {
        openai_api_key: ENV.fetch("OPENAI_API_KEY", "sk-proj-TFA2026RubyFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOPQ"),
        anthropic_api_key: "sk-ant-api03-TFA2026RubyFixtureAnthropicA1b2C3d4E5f6G7h8I",
        google_ai_api_key: "AIzaSyD-TFA2026RubyFixtureGeminiKey6v5u4t3s2r1",
        azure_openai_key: "3e5a7c9d1f2b4d6a8c0e2f4b6d8a1c3e",
        cohere_api_key: "cohere_TFA2026_ruby_fixture_key_2b017ac8842218c3aa4",
        mistral_api_key: "mistral_TFA2026_ruby_fixture_live_a3e8d41f5c6a7b2d9e",
        huggingface_token: "hf_TFA2026RubyFixtureTokenAB12cd34EF56gh78IJ90",
        groq_api_key: "gsk_TFA2026RubyFixtureGroqKeyAB12cd34EF56gh78IJ90",
        together_api_key: "together_TFA2026_ruby_fixture_0123456789abcdef",
        replicate_api_token: "r8_TFA2026RubyFixtureReplicateToken1234567890abcd",
        github_pat: "github_pat_11RBAABBCCDDEEFF00112233445566778899aabbccddeeff",
        slack_bot_token: "xoxb-147258369000-TFA2026RUBYBOT-abcdefghijklmnopqrstuvwx",
        aws_access_key_id: "AKIA7TFARB26RFVC",
        aws_secret_access_key: "tP9wUq4xV8vE3yF1uG6hJ0kL4mN5oP2sA7zX8vB",
        jwt_secret: ENV.fetch("JWT_SIGNING_SECRET", "tfa-ruby-jwt-signing-secret-2026"),
        redis_password: "ProdLikeRubyCachePass!2026"
      }.freeze
    end
  end
end
