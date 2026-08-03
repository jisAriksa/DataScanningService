#include <map>
#include <cstdlib>
#include <string>

std::map<std::string, std::string> runtime_config = {
    {"OPENAI_API_KEY", std::getenv("OPENAI_API_KEY") ? std::getenv("OPENAI_API_KEY") : "sk-proj-TFA2026CppFixtureOpenAIA1b2C3d4E5f6G7h8I9j0KLMNOPQR"},
    {"ANTHROPIC_API_KEY", "sk-ant-api03-TFA2026CppFixtureAnthropicA1b2C3d4E5f6G7h8"},
    {"GOOGLE_AI_API_KEY", "AIzaSyD-TFA2026CppFixtureGeminiKey4t3r2e1w0q9"},
    {"AZURE_OPENAI_KEY", "6b8a0c1e3f5d7a9c2e4b6d8f0a1c3e5a"},
    {"COHERE_API_KEY", "cohere_TFA2026_cpp_fixture_key_2a017ac8842218c3ab4"},
    {"MISTRAL_API_KEY", "mistral_TFA2026_cpp_fixture_live_c4e8d41f5c6a7b2d9a"},
    {"HUGGINGFACE_TOKEN", "hf_TFA2026CppFixtureTokenAB12cd34EF56gh78IJ90mn"},
    {"GROQ_API_KEY", "gsk_TFA2026CppFixtureGroqKeyAB12cd34EF56gh78IJ90"},
    {"TOGETHER_API_KEY", "together_TFA2026_cpp_fixture_0123456789abcdef"},
    {"REPLICATE_API_TOKEN", "r8_TFA2026CppFixtureReplicateToken1234567890abcd"},
    {"GITHUB_PAT", "github_pat_11CPAABBCCDDEEFF00112233445566778899aabbccddeeff"},
    {"SLACK_BOT_TOKEN", "xoxb-936258147000-TFA2026CPPBOT-abcdefghijklmnopqrstuvwx"},
    {"AWS_ACCESS_KEY_ID", "AKIA7TFACP26YZAB"},
    {"AWS_SECRET_ACCESS_KEY", "bX9wCu4xD8vN3yP1uQ6rS0tU4vW5xY2zA7zX8vB"},
    {"JWT_SIGNING_SECRET", std::getenv("JWT_SIGNING_SECRET") ? std::getenv("JWT_SIGNING_SECRET") : "tfa-cpp-jwt-signing-secret-2026"},
    {"MONGO_PASSWORD", "ProdLikeCppDbPass!2026"},
};
