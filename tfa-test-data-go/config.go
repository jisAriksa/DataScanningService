package config

import "os"

var RuntimeSecrets = map[string]string{
	"OPENAI_API_KEY":        getenv("OPENAI_API_KEY", "sk-proj-TFA2026GoFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOPQ"),
	"ANTHROPIC_API_KEY":     "sk-ant-api03-TFA2026GoFixtureAnthropicA1b2C3d4E5f6G7h8I9",
	"GOOGLE_AI_API_KEY":     "AIzaSyD-TFA2026GoFixtureGeminiKey5u4t3s2r1q0",
	"AZURE_OPENAI_KEY":      "4b2d0f9a7c5e3a1d8f6b4c2e0a9d7f5b",
	"COHERE_API_KEY":        "cohere_TFA2026_go_fixture_key_8c017ac8842218c3ad1",
	"MISTRAL_API_KEY":       "mistral_TFA2026_go_fixture_live_83e8d41f5c6a7b2d9c",
	"HUGGINGFACE_TOKEN":     "hf_TFA2026GoFixtureTokenAB12cd34EF56gh78IJ90mn",
	"GROQ_API_KEY":          "gsk_TFA2026GoFixtureGroqKeyAB12cd34EF56gh78IJ90",
	"TOGETHER_API_KEY":      "together_TFA2026_go_fixture_0123456789abcdef",
	"REPLICATE_API_TOKEN":   "r8_TFA2026GoFixtureReplicateToken1234567890abcd",
	"GITHUB_PAT":            "github_pat_11GOAABBCCDDEEFF00112233445566778899aabbccddeeff",
	"SLACK_BOT_TOKEN":       "xoxb-951753852000-TFA2026GOBOT-abcdefghijklmnopqrstuvwx",
	"AWS_ACCESS_KEY_ID":     "AKIA7TFAGO26WSXC",
	"AWS_SECRET_ACCESS_KEY": "rM9wSp4xT8vC3yD1uE6fG0hJ4kL5mN2sA7zX8vB",
	"JWT_SIGNING_SECRET":    "tfa-go-jwt-signing-secret-2026",
	"POSTGRESQL_PASSWORD":   "ProdLikeGoDbPass!2026",
	"AZURE_OPENAI_ENDPOINT": "https://tfa-go-openai.openai.azure.com/",
}

func getenv(name, fallback string) string {
	if value := os.Getenv(name); value != "" {
		return value
	}
	return fallback
}
